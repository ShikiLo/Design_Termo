package com.app;

import javax.swing.*;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;
import java.awt.*;

public class Gui extends JFrame

{
    ModelConstr constr;
    private JLabel label= new JLabel("This is first");
    private JComboBox comboBox=new JComboBox();
    private JPanel panel=new JPanel();
    private JPanel datafiles=new JPanel();
    private JPanel manyficha=new JPanel();
    private JPanel panelright=new JPanel();
    private JPanel datafiles1=new JPanel();
    private JPanel manyficha1=new JPanel();



    public Gui(){
        super("gui");

       /* this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container container=this.getContentPane();
        container.setLayout(new BorderLayout());


        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

        datafiles.setLayout(new BoxLayout(datafiles, BoxLayout.Y_AXIS));
        datafiles.setBorder(new TitledBorder(new EtchedBorder(), "Column"));

        manyficha.setLayout(new BoxLayout(manyficha, BoxLayout.Y_AXIS));
        manyficha.setBorder(new TitledBorder(new EtchedBorder(), "Column"));
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        for (int i = 0; i < 4; i++) {

            JToggleButton btn = new JToggleButton("Кнопка " + i);

            datafiles.add(btn);


        }
        for (int i = 0; i < 4; i++) {

            JToggleButton btn =

                    new JToggleButton("Кнопка " + i);


            manyficha.add(btn);

        }
        panel.add(datafiles);
        panel.add(manyficha);

        container.add(panel, BorderLayout.WEST);
        container.add(label, BorderLayout.NORTH);
        container.add(label, BorderLayout.SOUTH);


        panelright.setLayout(new BoxLayout(panelright, BoxLayout.Y_AXIS));

        datafiles1.setLayout(new BoxLayout(datafiles1, BoxLayout.Y_AXIS));
        datafiles1.setBorder(new TitledBorder(new EtchedBorder(), "Column"));

        manyficha1.setLayout(new BoxLayout(manyficha1, BoxLayout.Y_AXIS));
        manyficha1.setBorder(new TitledBorder(new EtchedBorder(), "Column"));

        for (int i = 0; i < 4; i++) {

            JToggleButton btn =

                    new JToggleButton("Кнопка " + i);

            datafiles1.add(btn);


        }
        for (int i = 0; i < 4; i++) {

            JToggleButton btn =

                    new JToggleButton("Кнопка " + i);


            manyficha1.add(btn);

        }
        panelright.add(datafiles1);
        panelright.add(manyficha1);

        container.add(panelright, BorderLayout.EAST);*/


        //JFrame frame = new JFrame("GridBagLayout Example");
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        CustomPanel topPanel = new CustomPanel(Color.BLUE.darker().darker());
        CustomPanel middlePanel = new CustomPanel(Color.CYAN.darker().darker());
        CustomPanel bottomPanel = new CustomPanel(Color.DARK_GRAY);

        JPanel contentPane = new JPanel();
        contentPane.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
        contentPane.setLayout(new GridBagLayout());

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.anchor = GridBagConstraints.FIRST_LINE_START;
        gbc.fill = GridBagConstraints.VERTICAL;
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.weightx = 1.0;
        gbc.weighty = 0.3;

        contentPane.add(topPanel, gbc);

        gbc.gridy = 1;
        contentPane.add(middlePanel, gbc);

        gbc.gridy = 2;
        gbc.fill = GridBagConstraints.BOTH;
        contentPane.add(bottomPanel, gbc);

        this.setContentPane(contentPane);
        this.pack();
        this.setLocationByPlatform(true);
        this.setVisible(true);
    }
    class CustomPanel extends JPanel
    {
        public CustomPanel(Color backGroundColour)
        {
            setOpaque(true);
            setBackground(backGroundColour);
        }

        @Override
        public Dimension getPreferredSize()
        {
            return (new Dimension(200, 150));
        }
    }
}
