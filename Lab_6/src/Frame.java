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
                String text = dots.getText();
                int dotsNumber = Integer.parseInt(text);
//                System.out.println(dotsNumber);
                panel.getGraphics().clearRect(0, 0, panel.getWidth(), panel.getHeight());
                int x = 10;
                for(int i=0; i < dotsNumber; i++){
                    Graphics dot = panel.getGraphics();
                    dot.drawOval(x,10,5,5);
                    x +=10;
                }
            }
        });
        submiLines.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String text = lines.getText();
                int linesNumber = Integer.parseInt(text);
//                System.out.println(linesNumber);
                panel.getGraphics().clearRect(0, 0, panel.getWidth(), panel.getHeight());
                int x1 = 10;
                for(int i=0; i < linesNumber; i++){
                    Graphics line = panel.getGraphics();
                    line.drawLine(10 +x1,10,200+x1,200);
                    x1 +=10;
                }
            }
        });
        formPanel.add(lableDots);
        formPanel.add(dots());
        formPanel.add(submitDots);
        this.lableLines = new JLabel("Nr. de linii");
        formPanel.add(lableLines);
        formPanel.add(lines());
        formPanel.add(submiLines);
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
