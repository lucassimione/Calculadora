/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora.control;

import calculadora.model.usuario;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * FXML Controller class
 *
 * @author 04025276232
 */
public class CadastrarUsuarioController implements Initializable {

    @FXML
    private Button btnCadastro;
    @FXML
    private Button btnVoltar;
    @FXML
    private TextField txtSenha;
    @FXML
    private TextField txtUsuario;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void cadastro(ActionEvent event) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("calculadora");
        EntityManager em = emf.createEntityManager();
        
        usuario u = null;
        u.setUsuario(txtUsuario.getText());
        u.setSenha(txtSenha.getText());
       
        em.getTransaction().begin();
        em.persist(u);
        em.getTransaction().commit();
    }

    @FXML
    private void voltar(ActionEvent event) {
    }
    
}
