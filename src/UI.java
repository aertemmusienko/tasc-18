import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

public class UI extends JFrame implements MouseMotionListener {

    private Label label = new Label();
    private Color color = Color.black;
    private boolean isEraser = false;
    private int x = 0;
    private int y = 0;

    UI() {
        setSize(700, 1000);
        addMouseMotionListener(this);
        setLayout(null);


        label.setBounds(0, 0, 100, 50);
        label.isOpaque();
        add(label);

        JButton button = new JButton("Delte");
        button.setBounds(0, 50, 100, 50);
        button.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY, 3));
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Graphics g = getGraphics();
                g.setColor(Color.white);
                g.fillRect(0, 131, 700, 800);
                g.fillRect(458,0,250,131);

            }
        });
        add(button);
        JButton button2 = new JButton();
        button2.setBounds(100, 0, 50, 50);
        button2.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY, 3));
        button2.isOpaque();
        button2.setBackground(Color.red);
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                color = Color.red;

            }
        });
        add(button2);
        JButton button3 = new JButton();
        button3.setBounds(150, 0, 50, 50);
        button3.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY, 3));
        button3.isOpaque();
        button3.setBackground(Color.blue);
        button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                color = Color.blue;

            }
        });
        add(button3);
        JButton button4 = new JButton();
        button4.setBounds(200, 0, 50, 50);
        button4.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY, 3));
        button4.isOpaque();
        button4.setBackground(new Color(14, 142, 6));
        button4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                color = new Color(14, 142, 6);

            }
        });
        add(button4);
        JButton button5 = new JButton();
        button5.setBounds(250, 0, 50, 50);
        button5.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY, 3));
        button5.isOpaque();
        button5.setBackground(Color.yellow);
        button5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                color = Color.yellow;

            }
        });
        add(button5);
        JButton button6 = new JButton();
        button6.setBounds(100, 50, 50, 50);
        button6.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY, 3));
        button6.isOpaque();
        button6.setBackground(Color.black);
        button6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                color = Color.black;

            }
        });
        add(button6);
        JButton button7 = new JButton();
        button7.setBounds(150, 50, 50, 50);
        button7.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY, 3));
        button7.isOpaque();
        button7.setBackground(Color.white);
        button7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                color = Color.white;

            }
        });
        add(button7);
        JButton button8 = new JButton();
        button8.setBounds(200, 50, 50, 50);
        button8.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY, 3));
        button8.isOpaque();
        button8.setBackground(Color.gray);
        button8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {


                color = Color.gray;


            }
        });
        add(button8);
        JButton button9 = new JButton();
        button9.setBounds(250, 50, 50, 50);
        button9.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY, 3));
        button9.isOpaque();
        button9.setBackground(Color.pink);
        button9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                color = Color.pink;

            }
        });
        add(button9);
        JButton button10 = new JButton();
        button10.setBounds(300, 50, 50, 50);
        button10.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY, 3));
        button10.isOpaque();
        button10.setBackground(Color.orange);
        button10.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                color = Color.orange;

            }
        });
        add(button10);
        JButton button11 = new JButton();
        button11.setBounds(300, 0, 50, 50);
        button11.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY, 3));
        button11.isOpaque();
        button11.setBackground(Color.cyan);
        button11.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                color = Color.cyan;


            }
        });
        add(button11);
        JButton eraseButton = new JButton("gym");
        eraseButton.setBounds(350, 0, 100, 50);
        eraseButton.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY, 3));
        eraseButton.setBackground(Color.LIGHT_GRAY);

        eraseButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                isEraser = true;
            }
        });

        add(eraseButton);

        JButton brushButton = new JButton("pensil");
        brushButton.setBounds(350, 50, 100, 50);
        brushButton.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY, 3));
        brushButton.setBackground(Color.LIGHT_GRAY);

        brushButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                isEraser = false;
            }
        });

        add(brushButton);


        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        label.setText("x = " + e.getX() + " y =" + e.getY());
        Graphics g = getGraphics();
        g.setColor(color);

        if (isEraser) {
            g.setColor(Color.white);
            g.fillRect(e.getX() - 10, e.getY() - 10, 20, 20); // Імітація стирання
        } else {
            g.setColor(color);
            if (x == 0 && y == 0) {
                x = e.getX();
                y = e.getY();
                return;
            }
            g.drawLine(x, y, e.getX(), e.getY());
        }


            x = e.getX();
            y = e.getY();


        }

        @Override
        public void mouseMoved (MouseEvent e){
            x = 0;
            y = 0;


        }
    }

