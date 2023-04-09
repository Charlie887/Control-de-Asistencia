package Formularios;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.UIManager;

public class FormMenu extends javax.swing.JFrame {
    
    private JMenuBar mMenu;
    private JMenu Home, mniGestionar, mniRegistrar, mniReportes, mniExamen, mniAjustes;
    private JMenuItem Inicio, Salir;
    private JMenuItem mniGestionar1, mniGestionar2, mniGestionar3, mniGestionar4, mniGestionar5, mniGestionar6;
    private JMenuItem mniRegistrar1, mniRegistrar2, mniRegistrar3, mniRegistrar4;
    private JMenuItem mniReportes1, mniReportes2;
    private JMenuItem mniExamen1, mniExamen2;
    private JMenuItem mniAjustes1;
    private String iconCurso = "/Imagenes/Iconos/home_icon.png",
            iconMateria = "/Imagenes/Iconos/materia_icon.png",
            iconEstudiante = "/Imagenes/Iconos/estudiante_icon.png",
            iconPeriodo = "/Imagenes/Iconos/periodo_icon.png",
            iconTarea = "/Imagenes/Iconos/tarea_icon.png",
            iconExamen = "/Imagenes/Iconos/examen_icon.png",
            iconAsistencia = "/Imagenes/Iconos/asistencia_icon.png",
            iconSello = "/Imagenes/Iconos/sello_icon.png",
            iconUsuario = "/Imagenes/Iconos/usuario_icon.png";
    
    Font miFont = new Font("Leelawadee UI", Font.BOLD, 14);
    Color color = new Color(255, 255, 255);
    
    public FormMenu() {
        initComponents();
        mMenu = new JMenuBar();
        setJMenuBar(mMenu);
        
        Home = new JMenu("HOGAR");
        mMenu.add(Home);
        Home.setForeground(color);
        Home.setFont(miFont);
        Inicio = new JMenuItem("INICIO", getIcon(iconCurso));
        Home.add(Inicio);
        Inicio.setForeground(color);
        Inicio.setFont(miFont);
        Salir = new JMenuItem("SALIR");
        Home.add(Salir);
        Salir.setForeground(color);
        Salir.setFont(miFont);
        
        mniGestionar = new JMenu("GESTIONAR");
        mMenu.add(mniGestionar);
        mniGestionar.setForeground(color);
        mniGestionar.setFont(miFont);
        mniGestionar1 = new JMenuItem("CURSO", getIcon(iconCurso));
        mniGestionar.add(mniGestionar1);
        mniGestionar1.setForeground(color);
        mniGestionar1.setFont(miFont);
        mniGestionar2 = new JMenuItem("MATERIA", getIcon(iconMateria));
        mniGestionar.add(mniGestionar2);
        mniGestionar2.setForeground(color);
        mniGestionar2.setFont(miFont);
        mniGestionar3 = new JMenuItem("ESTUDAINTES", getIcon(iconEstudiante));
        mniGestionar.add(mniGestionar3);
        mniGestionar3.setForeground(color);
        mniGestionar3.setFont(miFont);
        mniGestionar4 = new JMenuItem("PERIODO", getIcon(iconPeriodo));
        mniGestionar.add(mniGestionar4);
        mniGestionar4.setForeground(color);
        mniGestionar4.setFont(miFont);
        mniGestionar5 = new JMenuItem("TAREA", getIcon(iconTarea));
        mniGestionar.add(mniGestionar5);
        mniGestionar5.setForeground(color);
        mniGestionar5.setFont(miFont);
        mniGestionar6 = new JMenuItem("EXAMEN", getIcon(iconExamen));
        mniGestionar.add(mniGestionar6);
        mniGestionar6.setForeground(color);
        mniGestionar6.setFont(miFont);
        
        mniRegistrar = new JMenu("REGISTRAR");
        mMenu.add(mniRegistrar);
        mniRegistrar.setForeground(color);
        mniRegistrar.setFont(miFont);
        mniRegistrar1 = new JMenuItem("ASISTENCIA", getIcon(iconAsistencia));
        mniRegistrar.add(mniRegistrar1);
        mniRegistrar1.setForeground(color);
        mniRegistrar1.setFont(miFont);
        mniRegistrar2 = new JMenuItem("TAREAS", getIcon(iconTarea));
        mniRegistrar.add(mniRegistrar2);
        mniRegistrar2.setForeground(color);
        mniRegistrar2.setFont(miFont);
        mniRegistrar3 = new JMenuItem("SELLOS", getIcon(iconSello));
        mniRegistrar.add(mniRegistrar3);
        mniRegistrar3.setForeground(color);
        mniRegistrar3.setFont(miFont);
        mniRegistrar4 = new JMenuItem("EXAMENES", getIcon(iconExamen));
        mniRegistrar.add(mniRegistrar4);
        mniRegistrar4.setForeground(color);
        mniRegistrar4.setFont(miFont);
        
        mniReportes = new JMenu("REPORTES");
        mMenu.add(mniReportes);
        mniReportes.setForeground(color);
        mniReportes.setFont(miFont);
        mniReportes1 = new JMenuItem("ASISTENCIA", getIcon(iconAsistencia));
        mniReportes.add(mniReportes1);
        mniReportes1.setForeground(color);
        mniReportes1.setFont(miFont);
        mniReportes2 = new JMenuItem("TAREAS", getIcon(iconTarea));
        mniReportes.add(mniReportes2);
        mniReportes2.setForeground(color);
        mniReportes2.setFont(miFont);
        
        mniExamen = new JMenu("EXAMEN");
        mMenu.add(mniExamen);
        mniExamen.setForeground(color);
        mniExamen.setFont(miFont);
        mniExamen1 = new JMenuItem("CURSO", getIcon(iconCurso));
        mniExamen.add(mniExamen1);
        mniExamen1.setForeground(color);
        mniExamen1.setFont(miFont);
        mniExamen2 = new JMenuItem("ESTUDIANTE", getIcon(iconEstudiante));
        mniExamen.add(mniExamen2);
        mniExamen2.setForeground(color);
        mniExamen2.setFont(miFont);
        
        mniAjustes = new JMenu("AJUSTES");
        mMenu.add(mniAjustes);
        mniAjustes.setForeground(color);
        mniAjustes.setFont(miFont);
        mniAjustes1 = new JMenuItem("USUARIO", getIcon(iconUsuario));
        mniAjustes.add(mniAjustes1);
        mniAjustes1.setForeground(color);
        mniAjustes1.setFont(miFont);
        
        Inicio.addActionListener((ActionEvent e) -> {
            CambiarVista(FMInicio);
        });
        
        Salir.addActionListener((ActionEvent e) -> {
            System.exit(0);
        });
        
        mniGestionar1.addActionListener((ActionEvent e) -> {
            CambiarVista(GesCurso);
        });
        mniGestionar2.addActionListener((ActionEvent e) -> {
            CambiarVista(GesMateria);
        });
        mniGestionar3.addActionListener((ActionEvent e) -> {
            CambiarVista(GesEstudiante);
        });
        mniGestionar4.addActionListener((ActionEvent e) -> {
            CambiarVista(GesPeriodo);
        });
        mniGestionar5.addActionListener((ActionEvent e) -> {
            CambiarVista(GesTarea);
        });
        mniGestionar6.addActionListener((ActionEvent e) -> {
            CambiarVista(GesExamen);
        });
        
        mniRegistrar1.addActionListener((ActionEvent e) -> {
            CambiarVista(RegAsistencia);
        });
        mniRegistrar2.addActionListener((ActionEvent e) -> {
            CambiarVista(RegTareas);
        });
        mniRegistrar3.addActionListener((ActionEvent e) -> {
            CambiarVista(RegSellos);
        });
        mniRegistrar4.addActionListener((ActionEvent e) -> {
            CambiarVista(RegExamen);
        });
        
        mniReportes1.addActionListener((ActionEvent e) -> {
            CambiarVista(RepAsistencia);
        });
        mniReportes2.addActionListener((ActionEvent e) -> {
            CambiarVista(RepTareas);
        });
        
        mniExamen1.addActionListener((ActionEvent e) -> {
            CambiarVista(ExaCurso);
        });
        mniExamen2.addActionListener((ActionEvent e) -> {
            CambiarVista(ExaEstudiante);
        });
        
        mniAjustes1.addActionListener((ActionEvent e) -> {
            CambiarVista(ConfiUsuario);
        });
    }

    private void CambiarVista(JPanel jpanel) {
        JPrincipal.removeAll();
        JPrincipal.add(jpanel);
        JPrincipal.repaint();
        
        ActivarVista(jpanel);
    }

    private void ActivarVista(JPanel jpanel) {
        FMInicio.setEnabled(false);
        FMInicio.setVisible(false);
        
        GesCurso.setEnabled(false);
        GesCurso.setVisible(false);
        GesEstudiante.setEnabled(false);
        GesEstudiante.setVisible(false);
        GesExamen.setEnabled(false);
        GesExamen.setVisible(false);
        GesMateria.setEnabled(false);
        GesMateria.setVisible(false);
        GesPeriodo.setEnabled(false);
        GesPeriodo.setVisible(false);
        GesTarea.setEnabled(false);
        GesTarea.setVisible(false);
        
        RegAsistencia.setEnabled(false);
        RegAsistencia.setVisible(false);
        RegExamen.setEnabled(false);
        RegExamen.setVisible(false);
        RegSellos.setEnabled(false);
        RegSellos.setVisible(false);
        RegTareas.setEnabled(false);
        RegTareas.setVisible(false);
        
        RepAsistencia.setEnabled(false);
        RepAsistencia.setVisible(false);
        RepTareas.setEnabled(false);
        RepTareas.setVisible(false);
        
        ExaCurso.setEnabled(false);
        ExaCurso.setVisible(false);
        ExaEstudiante.setEnabled(false);
        ExaEstudiante.setVisible(false);
        
        ConfiUsuario.setEnabled(false);
        ConfiUsuario.setVisible(false);
        
        jpanel.setEnabled(true);
        jpanel.setVisible(true);
    }
    
    private Icon getIcon(String ruta) {
        return new ImageIcon(new ImageIcon(getClass().getResource(ruta))
                .getImage().getScaledInstance(30, 30, 0));
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JPrincipal = new javax.swing.JPanel();
        FMInicio = new javax.swing.JPanel();
        LOGO = new javax.swing.JLabel();
        TEXTO = new javax.swing.JLabel();
        GesCurso = new javax.swing.JPanel();
        GesMateria = new javax.swing.JPanel();
        GesEstudiante = new javax.swing.JPanel();
        GesPeriodo = new javax.swing.JPanel();
        GesTarea = new javax.swing.JPanel();
        GesExamen = new javax.swing.JPanel();
        RegAsistencia = new javax.swing.JPanel();
        RegTareas = new javax.swing.JPanel();
        RegSellos = new javax.swing.JPanel();
        RegExamen = new javax.swing.JPanel();
        RepAsistencia = new javax.swing.JPanel();
        RepTareas = new javax.swing.JPanel();
        ExaCurso = new javax.swing.JPanel();
        ExaEstudiante = new javax.swing.JPanel();
        ConfiUsuario = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(153, 0, 0));
        setMaximumSize(new java.awt.Dimension(1000, 600));
        setMinimumSize(new java.awt.Dimension(100, 600));

        JPrincipal.setMaximumSize(new java.awt.Dimension(1000, 600));
        JPrincipal.setPreferredSize(new java.awt.Dimension(1000, 600));
        JPrincipal.setLayout(new java.awt.CardLayout());

        FMInicio.setBackground(new java.awt.Color(255, 255, 255));
        FMInicio.setMaximumSize(new java.awt.Dimension(1000, 600));
        FMInicio.setMinimumSize(new java.awt.Dimension(1000, 600));
        FMInicio.setPreferredSize(new java.awt.Dimension(1000, 600));
        FMInicio.setLayout(null);

        LOGO.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LOGO.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Iconos/books_education_learning_knowledge_icon.png"))); // NOI18N
        FMInicio.add(LOGO);
        LOGO.setBounds(0, 0, 1000, 600);

        TEXTO.setFont(new java.awt.Font("Leelawadee UI", 1, 48)); // NOI18N
        TEXTO.setForeground(new java.awt.Color(153, 0, 0));
        TEXTO.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TEXTO.setText("BIENVENIDO");
        FMInicio.add(TEXTO);
        TEXTO.setBounds(0, 71, 1000, 140);

        JPrincipal.add(FMInicio, "card2");

        GesCurso.setBackground(new java.awt.Color(255, 255, 255));
        GesCurso.setMaximumSize(new java.awt.Dimension(1000, 600));
        GesCurso.setMinimumSize(new java.awt.Dimension(1000, 600));
        GesCurso.setPreferredSize(new java.awt.Dimension(1000, 600));

        javax.swing.GroupLayout GesCursoLayout = new javax.swing.GroupLayout(GesCurso);
        GesCurso.setLayout(GesCursoLayout);
        GesCursoLayout.setHorizontalGroup(
            GesCursoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1000, Short.MAX_VALUE)
        );
        GesCursoLayout.setVerticalGroup(
            GesCursoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
        );

        JPrincipal.add(GesCurso, "card3");

        GesMateria.setMaximumSize(new java.awt.Dimension(1000, 600));
        GesMateria.setMinimumSize(new java.awt.Dimension(1000, 600));
        GesMateria.setPreferredSize(new java.awt.Dimension(1000, 600));

        javax.swing.GroupLayout GesMateriaLayout = new javax.swing.GroupLayout(GesMateria);
        GesMateria.setLayout(GesMateriaLayout);
        GesMateriaLayout.setHorizontalGroup(
            GesMateriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1000, Short.MAX_VALUE)
        );
        GesMateriaLayout.setVerticalGroup(
            GesMateriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
        );

        JPrincipal.add(GesMateria, "card4");

        GesEstudiante.setMaximumSize(new java.awt.Dimension(1000, 600));
        GesEstudiante.setMinimumSize(new java.awt.Dimension(1000, 600));
        GesEstudiante.setPreferredSize(new java.awt.Dimension(1000, 600));

        javax.swing.GroupLayout GesEstudianteLayout = new javax.swing.GroupLayout(GesEstudiante);
        GesEstudiante.setLayout(GesEstudianteLayout);
        GesEstudianteLayout.setHorizontalGroup(
            GesEstudianteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1000, Short.MAX_VALUE)
        );
        GesEstudianteLayout.setVerticalGroup(
            GesEstudianteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
        );

        JPrincipal.add(GesEstudiante, "card5");

        GesPeriodo.setMaximumSize(new java.awt.Dimension(1000, 600));
        GesPeriodo.setMinimumSize(new java.awt.Dimension(1000, 600));
        GesPeriodo.setPreferredSize(new java.awt.Dimension(1000, 600));

        javax.swing.GroupLayout GesPeriodoLayout = new javax.swing.GroupLayout(GesPeriodo);
        GesPeriodo.setLayout(GesPeriodoLayout);
        GesPeriodoLayout.setHorizontalGroup(
            GesPeriodoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1000, Short.MAX_VALUE)
        );
        GesPeriodoLayout.setVerticalGroup(
            GesPeriodoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
        );

        JPrincipal.add(GesPeriodo, "card6");

        GesTarea.setMaximumSize(new java.awt.Dimension(1000, 600));
        GesTarea.setMinimumSize(new java.awt.Dimension(1000, 600));
        GesTarea.setPreferredSize(new java.awt.Dimension(1000, 600));

        javax.swing.GroupLayout GesTareaLayout = new javax.swing.GroupLayout(GesTarea);
        GesTarea.setLayout(GesTareaLayout);
        GesTareaLayout.setHorizontalGroup(
            GesTareaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1000, Short.MAX_VALUE)
        );
        GesTareaLayout.setVerticalGroup(
            GesTareaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
        );

        JPrincipal.add(GesTarea, "card7");

        GesExamen.setMaximumSize(new java.awt.Dimension(1000, 600));
        GesExamen.setMinimumSize(new java.awt.Dimension(1000, 600));
        GesExamen.setPreferredSize(new java.awt.Dimension(1000, 600));

        javax.swing.GroupLayout GesExamenLayout = new javax.swing.GroupLayout(GesExamen);
        GesExamen.setLayout(GesExamenLayout);
        GesExamenLayout.setHorizontalGroup(
            GesExamenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1000, Short.MAX_VALUE)
        );
        GesExamenLayout.setVerticalGroup(
            GesExamenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
        );

        JPrincipal.add(GesExamen, "card8");

        RegAsistencia.setMaximumSize(new java.awt.Dimension(1000, 600));
        RegAsistencia.setMinimumSize(new java.awt.Dimension(1000, 600));
        RegAsistencia.setPreferredSize(new java.awt.Dimension(1000, 600));

        javax.swing.GroupLayout RegAsistenciaLayout = new javax.swing.GroupLayout(RegAsistencia);
        RegAsistencia.setLayout(RegAsistenciaLayout);
        RegAsistenciaLayout.setHorizontalGroup(
            RegAsistenciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1000, Short.MAX_VALUE)
        );
        RegAsistenciaLayout.setVerticalGroup(
            RegAsistenciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
        );

        JPrincipal.add(RegAsistencia, "card9");

        RegTareas.setMaximumSize(new java.awt.Dimension(1000, 600));
        RegTareas.setMinimumSize(new java.awt.Dimension(1000, 600));
        RegTareas.setPreferredSize(new java.awt.Dimension(1000, 600));

        javax.swing.GroupLayout RegTareasLayout = new javax.swing.GroupLayout(RegTareas);
        RegTareas.setLayout(RegTareasLayout);
        RegTareasLayout.setHorizontalGroup(
            RegTareasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1000, Short.MAX_VALUE)
        );
        RegTareasLayout.setVerticalGroup(
            RegTareasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
        );

        JPrincipal.add(RegTareas, "card10");

        RegSellos.setMaximumSize(new java.awt.Dimension(1000, 600));
        RegSellos.setMinimumSize(new java.awt.Dimension(1000, 600));
        RegSellos.setPreferredSize(new java.awt.Dimension(1000, 600));

        javax.swing.GroupLayout RegSellosLayout = new javax.swing.GroupLayout(RegSellos);
        RegSellos.setLayout(RegSellosLayout);
        RegSellosLayout.setHorizontalGroup(
            RegSellosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1000, Short.MAX_VALUE)
        );
        RegSellosLayout.setVerticalGroup(
            RegSellosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
        );

        JPrincipal.add(RegSellos, "card11");

        RegExamen.setMaximumSize(new java.awt.Dimension(1000, 600));
        RegExamen.setMinimumSize(new java.awt.Dimension(1000, 600));
        RegExamen.setPreferredSize(new java.awt.Dimension(1000, 600));

        javax.swing.GroupLayout RegExamenLayout = new javax.swing.GroupLayout(RegExamen);
        RegExamen.setLayout(RegExamenLayout);
        RegExamenLayout.setHorizontalGroup(
            RegExamenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1000, Short.MAX_VALUE)
        );
        RegExamenLayout.setVerticalGroup(
            RegExamenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
        );

        JPrincipal.add(RegExamen, "card12");

        RepAsistencia.setMaximumSize(new java.awt.Dimension(1000, 600));
        RepAsistencia.setMinimumSize(new java.awt.Dimension(1000, 600));
        RepAsistencia.setPreferredSize(new java.awt.Dimension(1000, 600));

        javax.swing.GroupLayout RepAsistenciaLayout = new javax.swing.GroupLayout(RepAsistencia);
        RepAsistencia.setLayout(RepAsistenciaLayout);
        RepAsistenciaLayout.setHorizontalGroup(
            RepAsistenciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1000, Short.MAX_VALUE)
        );
        RepAsistenciaLayout.setVerticalGroup(
            RepAsistenciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
        );

        JPrincipal.add(RepAsistencia, "card13");

        RepTareas.setMaximumSize(new java.awt.Dimension(1000, 600));
        RepTareas.setMinimumSize(new java.awt.Dimension(1000, 600));
        RepTareas.setPreferredSize(new java.awt.Dimension(1000, 600));

        javax.swing.GroupLayout RepTareasLayout = new javax.swing.GroupLayout(RepTareas);
        RepTareas.setLayout(RepTareasLayout);
        RepTareasLayout.setHorizontalGroup(
            RepTareasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1000, Short.MAX_VALUE)
        );
        RepTareasLayout.setVerticalGroup(
            RepTareasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
        );

        JPrincipal.add(RepTareas, "card14");

        ExaCurso.setMaximumSize(new java.awt.Dimension(1000, 600));
        ExaCurso.setMinimumSize(new java.awt.Dimension(1000, 600));
        ExaCurso.setPreferredSize(new java.awt.Dimension(1000, 600));

        javax.swing.GroupLayout ExaCursoLayout = new javax.swing.GroupLayout(ExaCurso);
        ExaCurso.setLayout(ExaCursoLayout);
        ExaCursoLayout.setHorizontalGroup(
            ExaCursoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1000, Short.MAX_VALUE)
        );
        ExaCursoLayout.setVerticalGroup(
            ExaCursoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
        );

        JPrincipal.add(ExaCurso, "card15");

        ExaEstudiante.setMaximumSize(new java.awt.Dimension(1000, 600));
        ExaEstudiante.setMinimumSize(new java.awt.Dimension(1000, 600));
        ExaEstudiante.setPreferredSize(new java.awt.Dimension(1000, 600));

        javax.swing.GroupLayout ExaEstudianteLayout = new javax.swing.GroupLayout(ExaEstudiante);
        ExaEstudiante.setLayout(ExaEstudianteLayout);
        ExaEstudianteLayout.setHorizontalGroup(
            ExaEstudianteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1000, Short.MAX_VALUE)
        );
        ExaEstudianteLayout.setVerticalGroup(
            ExaEstudianteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
        );

        JPrincipal.add(ExaEstudiante, "card16");

        ConfiUsuario.setMaximumSize(new java.awt.Dimension(1000, 600));
        ConfiUsuario.setMinimumSize(new java.awt.Dimension(1000, 600));

        javax.swing.GroupLayout ConfiUsuarioLayout = new javax.swing.GroupLayout(ConfiUsuario);
        ConfiUsuario.setLayout(ConfiUsuarioLayout);
        ConfiUsuarioLayout.setHorizontalGroup(
            ConfiUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1000, Short.MAX_VALUE)
        );
        ConfiUsuarioLayout.setVerticalGroup(
            ConfiUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
        );

        JPrincipal.add(ConfiUsuario, "card16");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(JPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(JPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        Color color = new Color(153, 0, 0);
        UIManager.put("nimbusBase", color);

        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FormMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel ConfiUsuario;
    private javax.swing.JPanel ExaCurso;
    private javax.swing.JPanel ExaEstudiante;
    private javax.swing.JPanel FMInicio;
    private javax.swing.JPanel GesCurso;
    private javax.swing.JPanel GesEstudiante;
    private javax.swing.JPanel GesExamen;
    private javax.swing.JPanel GesMateria;
    private javax.swing.JPanel GesPeriodo;
    private javax.swing.JPanel GesTarea;
    private javax.swing.JPanel JPrincipal;
    private javax.swing.JLabel LOGO;
    private javax.swing.JPanel RegAsistencia;
    private javax.swing.JPanel RegExamen;
    private javax.swing.JPanel RegSellos;
    private javax.swing.JPanel RegTareas;
    private javax.swing.JPanel RepAsistencia;
    private javax.swing.JPanel RepTareas;
    private javax.swing.JLabel TEXTO;
    // End of variables declaration//GEN-END:variables
}