package agora.ccna.exempledespinner.sp2;

public class septNains {
    private String nom;
    private int idRessourceImage;
    public septNains(String n , int id){
        setNom(n);
        setIdRessourceImage(id);
    }
    public String getNom() {
        return nom;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }
    public int getIdRessourceImage() {
        return idRessourceImage;
    }
    public void setIdRessourceImage(int idRessourceImage) {
        this.idRessourceImage = idRessourceImage;
    }
    //facilite le debugage
    @Override
    public String toString(){
        return "nom:"+nom + "   id: " + idRessourceImage;
    }
}
