package deExo;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.io.Serial;

public class Ihm2 {

    private PartieBean partie;

    private JFrame frame;
    private JTextField textFieldScoreJ1;
    private JTextField textFieldScoreJ2;
    private JTextField textFieldDe1;
    private JTextField textFieldDe2;
    private JLabel lblTourValue;
    private JButton btnLancerJ1;
    private JButton btnLancerJ2;
    private final Action action = new SwingAction();
    private final Action action_1 = new SwingAction_1();

    int numClicksJ1 = 0;
    int numClicksJ2 = 0;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                try {
                    Ihm2 window = new Ihm2();
                    window.frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the application.
     */
    public Ihm2() {
        initialize();
    }

    /**
     * Initialize the contents of the frame.
     */
    private void initialize() {
        frame = new JFrame();
        frame.setBounds(100, 100, 450, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);

        partie = new PartieBean("adam", "anas");

        JLabel lblJoueur1 = new JLabel(partie.getJ1().getNom());
        lblJoueur1.setFont(new Font("Arial", Font.PLAIN, 14));
        lblJoueur1.setBounds(35, 25, 89, 28);
        frame.getContentPane().add(lblJoueur1);

        JLabel lblJoueur2 = new JLabel(partie.getJ2().getNom());
        lblJoueur2.setFont(new Font("Arial", Font.PLAIN, 14));
        lblJoueur2.setBounds(335, 25, 89, 28);
        frame.getContentPane().add(lblJoueur2);

        JLabel lblDe1 = new JLabel("DE 1");
        lblDe1.setBounds(182, 84, 26, 14);
        frame.getContentPane().add(lblDe1);

        JLabel lblDe2 = new JLabel("DE 2");
        lblDe2.setBounds(246, 84, 26, 14);
        frame.getContentPane().add(lblDe2);

        JLabel lblScoreJ1 = new JLabel("Score");
        lblScoreJ1.setFont(new Font("Arial", Font.PLAIN, 14));
        lblScoreJ1.setBounds(23, 96, 46, 14);
        frame.getContentPane().add(lblScoreJ1);

        JLabel lblScoreJ2 = new JLabel("Score");
        lblScoreJ2.setFont(new Font("Arial", Font.PLAIN, 14));
        lblScoreJ2.setBounds(330, 96, 46, 14);
        frame.getContentPane().add(lblScoreJ2);

        textFieldScoreJ1 = new JTextField();
        textFieldScoreJ1.setText("0");
        textFieldScoreJ1.setBounds(77, 95, 35, 17);
        frame.getContentPane().add(textFieldScoreJ1);
        textFieldScoreJ1.setColumns(10);

        textFieldScoreJ2 = new JTextField();
        textFieldScoreJ2.setText("0");
        textFieldScoreJ2.setBounds(379, 97, 35, 14);
        frame.getContentPane().add(textFieldScoreJ2);
        textFieldScoreJ2.setColumns(10);

        JLabel lblTour = new JLabel("Tour :");
        lblTour.setFont(new Font("Arial", Font.BOLD, 16));
        lblTour.setBounds(174, 31, 46, 14);
        frame.getContentPane().add(lblTour);

        lblTourValue = new JLabel("0");
        lblTourValue.setHorizontalAlignment(SwingConstants.CENTER);
        lblTourValue.setFont(new Font("Arial", Font.BOLD, 14));
        lblTourValue.setBounds(230, 32, 26, 14);
        frame.getContentPane().add(lblTourValue);

        textFieldDe1 = new JTextField();
        textFieldDe1.setBackground(Color.YELLOW);
        textFieldDe1.setHorizontalAlignment(SwingConstants.CENTER);
        textFieldDe1.setText("");
        textFieldDe1.setBounds(164, 109, 56, 57);
        frame.getContentPane().add(textFieldDe1);
        textFieldDe1.setColumns(10);

        textFieldDe2 = new JTextField();
        textFieldDe2.setBackground(Color.YELLOW);
        textFieldDe2.setHorizontalAlignment(SwingConstants.CENTER);
        textFieldDe2.setText("");
        textFieldDe2.setColumns(10);
        textFieldDe2.setBounds(230, 109, 56, 57);
        frame.getContentPane().add(textFieldDe2);

        btnLancerJ1 = new JButton("Lancer");


        btnLancerJ1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                //	mon code Lancer Joueur1

                partie.getjCourant().lancer();
                textFieldDe1.setText("" + partie.getjCourant().getGobelet().getD1().getValue());
                textFieldDe2.setText("" + partie.getjCourant().getGobelet().getD2().getValue());

                if (partie.getjCourant().getGobelet().getScoreDes() > 7) {

                    partie.getjCourant().ajouter1pt();
                    textFieldScoreJ1.setText("" + partie.getjCourant().getScore());

                }
                numClicksJ1++;
                partie.changerJoueurCourant();
                btnLancerJ1.setEnabled(false);
                btnLancerJ2.setEnabled(true);
                if (numClicksJ1 == numClicksJ2) {
                    partie.ajouter1tour();
                    lblTourValue.setText("" + partie.getTour());
                }
            }
        });
        btnLancerJ1.setBounds(23, 156, 89, 23);
        frame.getContentPane().add(btnLancerJ1);

        btnLancerJ2 = new JButton("Lancer");

        btnLancerJ2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                //mon code Lancer Joueur2

                partie.getjCourant().lancer();
                textFieldDe1.setText("" + partie.getjCourant().getGobelet().getD1().getValue());
                textFieldDe2.setText("" + partie.getjCourant().getGobelet().getD2().getValue());

                if (partie.getjCourant().getGobelet().getScoreDes() > 7) {

                    partie.getjCourant().ajouter1pt();
                    textFieldScoreJ2.setText("" + partie.getjCourant().getScore());

                }
                numClicksJ2++;
                partie.changerJoueurCourant();
                btnLancerJ2.setEnabled(false);
                btnLancerJ1.setEnabled(true);
                if (numClicksJ1 == numClicksJ2) {
                    partie.ajouter1tour();
                    lblTourValue.setText("" + partie.getTour());
                }
            }
        });


        btnLancerJ2.setBounds(335, 156, 89, 23);
        frame.getContentPane().add(btnLancerJ2);

        JButton btnRestart = new JButton("Restart");

        btnRestart.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                //mon code Restart
            }
        });
        btnRestart.setBackground(Color.RED);
        btnRestart.setBounds(183, 199, 89, 23);
        frame.getContentPane().add(btnRestart);

        JCheckBox chckbxTricheurJ1 = new JCheckBox("Tricheur");
        chckbxTricheurJ1.addItemListener(new ItemListener() {

            @Override
            public void itemStateChanged(ItemEvent e) {
                System.out.println("Checked");
                partie.getJ1().setTricheur(true);
                //partie.getJ1().setGobelet(new GobeletBean(true));
            }
        });
        chckbxTricheurJ1.setBounds(23, 117, 97, 23);
        frame.getContentPane().add(chckbxTricheurJ1);

        JCheckBox chckbxTricheurJ2 = new JCheckBox("Tricheur");
        chckbxTricheurJ2.addItemListener(new ItemListener() {

            @Override
            public void itemStateChanged(ItemEvent e) {
                System.out.println("Checked 2");
                partie.getJ2().setTricheur(true);
                // partie.getJ2().setGobelet(new GobeletBean(true));
            }
        });
        chckbxTricheurJ2.setBounds(330, 117, 97, 23);
        frame.getContentPane().add(chckbxTricheurJ2);

        JButton btnAffDon = new JButton("Afficher les donnees");
        btnAffDon.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
            }
        });
        btnAffDon.setBackground(Color.GREEN);
        btnAffDon.setBounds(148, 227, 156, 23);
        frame.getContentPane().add(btnAffDon);

        JLabel lblLabel = new JLabel("Le joueur ");
        lblLabel.setFont(new Font("Arial", Font.PLAIN, 14));
        lblLabel.setBounds(149, 175, 64, 28);
        frame.getContentPane().add(lblLabel);

        JLabel lblGagnant = new JLabel("1");
        lblGagnant.setHorizontalAlignment(SwingConstants.CENTER);
        lblGagnant.setFont(new Font("Arial", Font.BOLD, 16));
        lblGagnant.setBounds(208, 167, 35, 42);
        frame.getContentPane().add(lblGagnant);

        JLabel lblLabel2 = new JLabel("a gagn\u00E9");
        lblLabel2.setFont(new Font("Arial", Font.PLAIN, 14));
        lblLabel2.setBounds(240, 175, 64, 28);
        frame.getContentPane().add(lblLabel2);
    }

    private class SwingAction extends AbstractAction {
        @Serial
        private static final long serialVersionUID = -6179738721398289399L;

        public SwingAction() {
            putValue(NAME, "SwingAction");
            putValue(SHORT_DESCRIPTION, "Some short description");
        }

        @Override
        public void actionPerformed(ActionEvent e) {
        }
    }

    private class SwingAction_1 extends AbstractAction {
        @Serial
        private static final long serialVersionUID = -2242629009006183242L;

        public SwingAction_1() {
            putValue(NAME, "SwingAction_1");
            putValue(SHORT_DESCRIPTION, "Some short description");
        }

        @Override
        public void actionPerformed(ActionEvent e) {
        }
    }
}
