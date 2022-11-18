package view;

import adapter.PersonaTableModel;
import model.Persona;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class frmMantPersona {
    private JTable tblpersona;

    private JTextField txtnombres;
    private JTextField txtapellidos;
    private JTextField txtemail;
    private JButton btnregistrar;
    private JRadioButton rbfemenino;
    private JRadioButton rbmasculino;
    private JCheckBox cbleer;
    private JCheckBox cbdeportes;
    private JCheckBox cbmusica;
    private JPanel root;

    List<Persona> personas = new ArrayList<>();

    public static void main(String[] args) {
        JFrame frame = new JFrame("frmMantPersona");
        frame.setContentPane(new frmMantPersona().root);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setSize(600, 500);
        frame.setVisible(true);
    }

    public frmMantPersona() {


        personas.add(new Persona("Luis", "Salvatierra",
                "lsalvat@gmail.com","Masculino"
                ));
        PersonaTableModel personaTableModel = new PersonaTableModel(personas);
        tblpersona.setModel(personaTableModel);
        tblpersona.setAutoCreateRowSorter(true);
        btnregistrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Persona objPersona = new Persona();
                objPersona.setNombres(txtnombres.getText());
                objPersona.setApellidos(txtapellidos.getText());
                objPersona.setEmail(txtemail.getText());
                if(rbfemenino.isSelected())
                    objPersona.setGenero(rbfemenino.getText());
                else
                    objPersona.setGenero(rbmasculino.getText());
                if (cbdeportes.isSelected())
                    objPersona.getHobbies().add(cbdeportes.getText());
                if (cbleer.isSelected())
                    objPersona.getHobbies().add(cbleer.getText());
                if (cbmusica.isSelected())
                    objPersona.getHobbies().add(cbmusica.getText());
                personas.add(objPersona);
                personaTableModel.fireTableDataChanged();
            }
        });
    }
}
