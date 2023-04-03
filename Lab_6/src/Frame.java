import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Frame extends JFrame {
    private JPanel formPanel = new JPanel();
    private JPanel panel = new JPanel();
    private JPanel buttonPanel = new JPanel();
    private Button submitDots =  new Button("Submit");
    private Button submiLines =  new Button("Submit");
    private Button exit = new Button("Exit");
    private Button load = new Button("Load");
    private Button save = new Button("Save");
    private JLabel lableDots ;
    private JLabel lableLines ;

    private JTextField dots;
    private JTextField lines;
    public Frame(){
        initialize();
    }
    public JTextField dots (){
        this.dots = new JTextField(10);
        return this.dots;
    }

    public JTextField lines (){
        this.lines = new JTextField(10);
        return this.lines;
    }
    public void initialize(){
        setTitle("Graphical User Interfaces");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setSize(800, 600);
        formPanel.setLayout(new FlowLayout(FlowLayout.LEFT, 10, 5));
        formPanel.setBackground(Color.PINK);
        this.lableDots = new JLabel("Nr. de puncte");
        submitDots.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String dotsN = dots.getText();
                int dotsNumber = Integer.parseInt(dotsN);
                String linesN = lines.getText();
                int linesNumber = Integer.parseInt(linesN);

                panel.getGraphics().clearRect(0, 0, panel.getWidth(), panel.getHeight());

                // Calculeaza coordonatele centrale ale panel-ului
                int centerX = panel.getWidth() / 2;
                int centerY = panel.getHeight() / 2;

                // Calculeaza raza cercului in care sunt pozitionate nodurile
                int radius = Math.min(centerX, centerY) * 3 / 4;

                // Calculeaza unghiul dintre doua noduri adiacente
                double angleStep = 2 * Math.PI / dotsNumber;

                // Deseneaza nodurile
                for (int i = 0; i < dotsNumber; i++) {
                    double angle = i * angleStep;
                    int x = (int) Math.round(centerX + radius * Math.cos(angle));
                    int y = (int) Math.round(centerY + radius * Math.sin(angle));
                    Graphics dot = panel.getGraphics();
                    dot.drawOval(x, y, 5, 5);
                }

                // Deseneaza muchiile intre noduri

                for (int i = 0; i < dotsNumber; i++) {
                    int node1 = i;
                    int node2 = (i + 1) % dotsNumber;
                    double angle1 = node1 * angleStep;
                    double angle2 = node2 * angleStep;
                    int x1 = (int) Math.round(centerX + radius * Math.cos(angle1));
                    int y1 = (int) Math.round(centerY + radius * Math.sin(angle1));
                    int x2 = (int) Math.round(centerX + radius * Math.cos(angle2));
                    int y2 = (int) Math.round(centerY + radius * Math.sin(angle2));
                    Graphics line = panel.getGraphics();
                    line.drawLine(x1, y1, x2, y2);

                }


                // Deseneaza muchiile suplimentare
                int extraLines = linesNumber - dotsNumber;
                for (int i = 0; i < extraLines; i++) {
                    int node1 = (int) Math.floor(Math.random() * dotsNumber);
                    int node2 = (int) Math.floor(Math.random() * dotsNumber);
                    while (node1 == node2) {
                        node2 = (int) Math.floor(Math.random() * dotsNumber);
                    }
                    double angle1 = node1 * angleStep;
                    double angle2 = node2 * angleStep;
                    int x1 = (int) Math.round(centerX + radius * Math.cos(angle1));
                    int y1 = (int) Math.round(centerY + radius * Math.sin(angle1));
                    int x2 = (int) Math.round(centerX + radius * Math.cos(angle2));
                    int y2 = (int) Math.round(centerY + radius * Math.sin(angle2));
                    Graphics line = panel.getGraphics();
                    line.drawLine(x1, y1, x2, y2);
                }



            }
        });

        formPanel.add(lableDots);
        formPanel.add(dots());
        this.lableLines = new JLabel("Nr. de linii");
        formPanel.add(lableLines);
        formPanel.add(lines());
        formPanel.add(submitDots);
        add(formPanel, BorderLayout.NORTH);
        buttonPanel.setLayout(new FlowLayout(FlowLayout.LEFT, 10, 5));
        buttonPanel.setBackground(Color.PINK);
        buttonPanel.add(save);
        buttonPanel.add(exit);
        buttonPanel.add(load);
        add(buttonPanel, BorderLayout.SOUTH);
        panel.setLayout(new FlowLayout(FlowLayout.LEFT, 10, 5));
        add(panel, BorderLayout.CENTER);

        setLocationRelativeTo(null);
        setResizable(false);

        setVisible(true);
    }


}
