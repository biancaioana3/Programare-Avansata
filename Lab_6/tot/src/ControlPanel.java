import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class ControlPanel extends JPanel {
    final MainFrame frame;
    JButton exit = new JButton("Exit");
    JButton load = new JButton("Load");
    JButton save = new JButton("Save");
    JButton reset = new JButton("Reset");

    public ControlPanel(MainFrame frame) {
        this.frame = frame;
        init();
    }

    private void init() {
        setLayout(new GridLayout(1, 5));
        add(load);
        add(save);
        add(reset);
        add(exit);

        load.addActionListener(e -> {
            JFileChooser fileChooser = new JFileChooser();
            int returnValue = fileChooser.showOpenDialog(frame);
            if (returnValue == JFileChooser.APPROVE_OPTION) {
                File selectedFile = fileChooser.getSelectedFile();
                // TODO: Load the game state from the selected file
                System.out.println("Loaded game state from file: " + selectedFile.getAbsolutePath());
            }
        });

        load.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                loadImage();
            }
        });
        save.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                saveImage();
            }
        });
        reset.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                reset();
            }
        });

        exit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                exitGame();
            }
        });
    }
    private void saveImage() {
        try {
            // Obțineți o referință la panoul care conține desenul
            Component content = frame.getContentPane().getComponent(2);

            // Creează o imagine tampon pentru a desena panoul pe ea
            BufferedImage image = new BufferedImage(content.getWidth(), content.getHeight(), BufferedImage.TYPE_INT_ARGB);
            Graphics2D g2d = image.createGraphics();

            // Desenați panoul pe imaginea tampon
            content.paint(g2d);
            g2d.dispose();

            // Afișează un dialog de salvare a fișierului
            JFileChooser fileChooser = new JFileChooser();
            fileChooser.setDialogTitle("Save As");
            fileChooser.setFileFilter(new FileNameExtensionFilter("PNG Images", "png"));

            if (fileChooser.showSaveDialog(this) == JFileChooser.APPROVE_OPTION) {
                // Salvează imaginea în fișierul selectat
                File fileToSave = fileChooser.getSelectedFile();
                ImageIO.write(image, "png", fileToSave);
                // Salvați imaginea tampon în fișierul PNG
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    private void loadImage() {
        JFileChooser fileChooser = new JFileChooser();
        int result = fileChooser.showOpenDialog(this);
        if (result == JFileChooser.APPROVE_OPTION) {
            File selectedFile = fileChooser.getSelectedFile();
            BufferedImage image = null;
            try {
                image = ImageIO.read(selectedFile);
            } catch (IOException e) {
                e.printStackTrace();
            }
            JLabel label = new JLabel(new ImageIcon(image));
            frame.getContentPane().removeAll();
            frame.getContentPane().add(label);
            frame.getContentPane().revalidate();
            frame.getContentPane().repaint();

        }
    }

    private void reset(){
        MainFrame.canvas.createBoard(0, (double) 0);
        System.out.println("Cleared the game board.");
    }
    private void exitGame() {
        frame.dispose();
    }
}