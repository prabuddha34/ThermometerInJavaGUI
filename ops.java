import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ops  implements ChangeListener {
    JLabel label;
    JPanel panel;
    JSlider slider;
    JFrame frame;

    ops(){
    frame=new JFrame("Slider");
    panel=new JPanel();
    label=new JLabel();
    slider=new JSlider(0,100,50);
    slider.setPreferredSize(new Dimension(400,300));
    slider.setPaintTicks(true);
    slider.setMinorTickSpacing(10);
        slider.setPaintTicks(true);
        slider.setMajorTickSpacing(25);
        slider.setPaintLabels(true);
        slider.setOrientation(SwingConstants.VERTICAL);
        label.setText("C ="+ slider.getValue());
        slider.addChangeListener(this);

    panel.add(slider);
    panel.add(label);
    frame.add(panel);
    frame.setSize(420,420);
    frame.setVisible(true);

    }
    @Override
    public void stateChanged(ChangeEvent e){
        label.setText("C ="+ slider.getValue());
    }
}
