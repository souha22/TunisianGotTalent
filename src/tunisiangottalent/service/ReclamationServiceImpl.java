package tunisiangottalent.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import tunisiangottalent.domain.Reclamation;
import tunisiangottalent.domain.Utilisateur;
import utils.DataSource;

public class ReclamationServiceImpl implements ReclamationService {

    //CRUD
    private Connection conn;
    private Statement ste;
    private PreparedStatement pst;
    private ResultSet rs;

    public ReclamationServiceImpl() throws ClassNotFoundException {
        conn = DataSource.getInstance().getCnx();
    }

    @Override
    public void insert(Reclamation r) {
        String req = "insert into reclamation (type ,detail_reclamation ,url) values(?,?,?)";
        try {
            pst = conn.prepareStatement(req);

            pst.setString(1, r.getType());
            pst.setString(2, r.getDetailReclamation());
            // pst.setDouble(3, r.getUtilisateur().getIdUtilisateur());

           // pst.setString(3, r.getUrl());

            pst.executeUpdate();

        } catch (SQLException ex) {
            Logger.getLogger(ReclamationServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void delete(int id) {
        String req = "delete from reclamation where id_reclamation = ?";
        try {
            pst = conn.prepareStatement(req);
            pst.setDouble(1, id);
            pst.executeUpdate();

        } catch (SQLException ex) {
            Logger.getLogger(ReclamationServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void update(Reclamation r) {
        String req = "update reclamation set type = ? ,"
                + " detail_reclamation =? ,"
                + " url =?"
                + " where id_reclamation = ?";

        try {
            pst = conn.prepareStatement(req);

            pst.setString(1, r.getType());
            pst.setString(2, r.getDetailReclamation());
            // pst.setDouble(3, r.getUtilisateur().getIdUtilisateur());
           // pst.setString(3, r.getUrl());
            pst.setDouble(4, r.getIdReclamation());

            pst.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(ReclamationServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    @Override
    public List<Reclamation> getAll() {
        String requete = "select * from reclamation";
        List<Reclamation> list = new ArrayList<>();
        try {
            ste = conn.createStatement();
            rs = ste.executeQuery(requete);
            while (rs.next()) {
                list.add(new Reclamation(rs.getDouble(1), (Utilisateur) rs.getObject(2), rs.getString(3), rs.getString(4), rs.getString(5)));
            }
        } catch (SQLException ex) {
            Logger.getLogger(ReclamationServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }

    @Override
    public Reclamation getById(int id) {
        Reclamation rec = null;
        String req = "select * from reclamation where id_reclamation = ?";
        try {

            pst = conn.prepareStatement(req);
            pst.setDouble(1, id);

            rs = pst.executeQuery(req);
            if (!rs.equals(null)) {
                rec = new Reclamation(rs.getDouble(1), (Utilisateur) rs.getObject(2), rs.getString(3), rs.getString(4), rs.getString(5));
                return rec;
            }
        } catch (SQLException ex) {
            Logger.getLogger(ReclamationServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }

        return rec;
    }

}
