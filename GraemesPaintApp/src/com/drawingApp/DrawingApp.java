package com.drawingApp;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.util.ArrayList;
import javax.imageio.ImageIO;

public class DrawingApp extends JFrame {
    private BufferedImage canvasImage;
    private Graphics2D g2d;
    private int lastX, lastY;
    private Color currentColor = Color.BLACK;
    private float lineThickness = 2.0f;

    // List to store text labels
    private ArrayList<TextLabel> textLabels = new ArrayList<>();
    private BufferedImage loadedImage; // For holding the loaded image
    private TextLabel selectedLabel = null;
    private Point lastMousePos;

    public DrawingApp() {
        setTitle("Jiggy Doodle");
        setSize(1800, 1000);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Initialize the canvas
        canvasImage = new BufferedImage(1800, 1000, BufferedImage.TYPE_INT_RGB);
        g2d = canvasImage.createGraphics();
        g2d.setColor(Color.WHITE);
        g2d.fillRect(0, 0, 1800, 1000);
        g2d.setColor(currentColor);
        g2d.setStroke(new BasicStroke(lineThickness));
        loadImageOnStartup();
        // Create a drawing panel
        DrawingPanel drawingPanel = new DrawingPanel();
        drawingPanel.setPreferredSize(new Dimension(1800, 1000));
        add(drawingPanel, BorderLayout.CENTER);

        // Add mouse listeners for drawing
        drawingPanel.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                lastX = e.getX();
                lastY = e.getY();
                selectLabelAt(e.getPoint());
            }
        });

        drawingPanel.addMouseMotionListener(new MouseAdapter() {
            @Override
            public void mouseDragged(MouseEvent e) {
                if (selectedLabel != null) {
                    // Move the selected label
                    selectedLabel.x += e.getX() - lastMousePos.x;
                    selectedLabel.y += e.getY() - lastMousePos.y;
                    lastMousePos = e.getPoint();
                } else {
                    // Draw line
                    g2d.drawLine(lastX, lastY, e.getX(), e.getY());
                    lastX = e.getX();
                    lastY = e.getY();
                }
                drawingPanel.repaint();
            }
        });

        // Create a menu bar
        JMenuBar menuBar = new JMenuBar();
        JMenu fileMenu = new JMenu("File");
        JMenuItem saveItem = new JMenuItem("Save As...");
        JMenuItem openItem = new JMenuItem("Open...");

        saveItem.addActionListener(e -> saveImage());
        openItem.addActionListener(e -> openImage());

        fileMenu.add(saveItem);
        fileMenu.add(openItem);
        menuBar.add(fileMenu);
        setJMenuBar(menuBar);

        // Create buttons for color, thickness, text, and clear
        JPanel controlPanel = new JPanel(new FlowLayout());
        JButton colorButton = new JButton("Choose Color");
        JButton thicknessButton = new JButton("Change Thickness");
        JButton textButton = new JButton("Add Text");
        JButton clearButton = new JButton("Clear Canvas");

        colorButton.addActionListener(e -> changeColor());
        thicknessButton.addActionListener(e -> showThicknessDialog());
        textButton.addActionListener(e -> addTextLabel());
        clearButton.addActionListener(e -> clearCanvas(drawingPanel));

        controlPanel.add(colorButton);
        controlPanel.add(thicknessButton);
        controlPanel.add(textButton);
        controlPanel.add(clearButton);
        add(controlPanel, BorderLayout.SOUTH);
    }

    private class DrawingPanel extends JPanel {
        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            g.drawImage(canvasImage, 0, 0, null);
            if (loadedImage != null) {
                int x = getWidth() - loadedImage.getWidth(); // 10px from the right
                int y = getHeight() - loadedImage.getHeight() ; // 10px from the bottom
                g.drawImage(loadedImage, x, y, null); // Draw the loaded image
            }
            // Draw text labels
            for (TextLabel label : textLabels) {
                g.setFont(label.font);
                g.setColor(Color.BLACK);
                g.drawString(label.text, label.x, label.y);
            }
        }
    }
    
    private void loadImageOnStartup() {
        try {
            loadedImage = ImageIO.read(new File("/home/watso/eclipse_Workspace_JEEE/GraemesPaintApp/src/JD.png")); // Change this path to your image
        } catch (Exception e) {
            System.err.println("Error loading image: " + e.getMessage());
        }
    }

    private void saveImage() {
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setDialogTitle("Save Image");
        fileChooser.setFileFilter(new javax.swing.filechooser.FileNameExtensionFilter("PNG Images", "png"));

        if (fileChooser.showSaveDialog(this) == JFileChooser.APPROVE_OPTION) {
            File file = fileChooser.getSelectedFile();
            if (!file.getName().toLowerCase().endsWith(".png")) {
                file = new File(file.getAbsolutePath() + ".png");
            }
            try {
                ImageIO.write(canvasImage, "png", file);
                JOptionPane.showMessageDialog(this, "Image saved su            if (loadedImage != null) {\n"
                		+ "                int x = getWidth() - loadedImage.getWidth() - 10; // 10px from the right\n"
                		+ "                int y = getHeight() - loadedImage.getHeight() - 10; // 10px from the bottom\n"
                		+ "                g.drawImage(loadedImage, x, y, null); // Draw the loaded image\n"
                		+ "            }ccessfully!", "Success", JOptionPane.INFORMATION_MESSAGE);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Error saving image: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    private void openImage() {
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setDialogTitle("Open Image");
        fileChooser.setFileFilter(new javax.swing.filechooser.FileNameExtensionFilter("PNG Images", "png"));

        if (fileChooser.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) {
            File file = fileChooser.getSelectedFile();
            try {
                canvasImage = ImageIO.read(file);
                g2d = canvasImage.createGraphics();
                g2d.setColor(currentColor);
                g2d.setStroke(new BasicStroke(lineThickness));
                repaint();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Error opening image: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    private void changeColor() {
        Color newColor = JColorChooser.showDialog(this, "Choose Line Color", currentColor);
        if (newColor != null) {
            currentColor = newColor;
            g2d.setColor(currentColor);
        }
    }

    private void showThicknessDialog() {
        JSlider thicknessSlider = new JSlider(JSlider.HORIZONTAL, 1, 10, (int) lineThickness);
        thicknessSlider.setMajorTickSpacing(1);
        thicknessSlider.setMinorTickSpacing(1);
        thicknessSlider.setPaintTicks(true);
        thicknessSlider.setPaintLabels(true);

        JOptionPane.showMessageDialog(this, thicknessSlider, "Adjust Line Thickness", JOptionPane.PLAIN_MESSAGE);
        lineThickness = thicknessSlider.getValue();
        g2d.setStroke(new BasicStroke(lineThickness));
    }

    private void clearCanvas(DrawingPanel drawingPanel) {
        g2d.setColor(Color.WHITE);
        g2d.fillRect(0, 0, canvasImage.getWidth(), canvasImage.getHeight());
        g2d.setColor(currentColor);
        g2d.setStroke(new BasicStroke(lineThickness));
        textLabels.clear(); // Clear text labels as well
        drawingPanel.repaint();
    }

    private void addTextLabel() {
        JTextField textField = new JTextField(10);
        JComboBox<String> fontSizeCombo = new JComboBox<>(new String[]{"10", "14", "18"});
        JCheckBox boldCheckBox = new JCheckBox("Bold");

        JPanel panel = new JPanel();
        panel.add(new JLabel("Enter text:"));
        panel.add(textField);
        panel.add(new JLabel("Font Size:"));
        panel.add(fontSizeCombo);
        panel.add(boldCheckBox);

        int result = JOptionPane.showConfirmDialog(this, panel, "Add Text Label", JOptionPane.OK_CANCEL_OPTION);
        if (result == JOptionPane.OK_OPTION) {
            String text = textField.getText();
            if (text != null && !text.trim().isEmpty()) {
                int fontSize = Integer.parseInt((String) fontSizeCombo.getSelectedItem());
                Font font = boldCheckBox.isSelected() ? new Font("Arial", Font.BOLD, fontSize) : new Font("Arial", Font.PLAIN, fontSize);
                int x = 100; // Default x position
                int y = 100; // Default y position
                textLabels.add(new TextLabel(text, x, y, font));
                repaint();
            }
        }
    }

    private void selectLabelAt(Point point) {
        for (TextLabel label : textLabels) {
            Rectangle labelBounds = new Rectangle(label.x, label.y - label.font.getSize(), label.text.length() * 7, label.font.getSize());
            if (labelBounds.contains(point)) {
                selectedLabel = label;
                lastMousePos = point;
                return;
            }
        }
        selectedLabel = null; // Deselect if no label is clicked
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            DrawingApp drawingApp = new DrawingApp();
            drawingApp.setVisible(true);
        });
    }
}
