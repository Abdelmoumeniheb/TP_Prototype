public abstract class Shape {
    public int x;
    public int y;
    public String couleur;
    public Shape(){
        super();
    }
    public Shape(int x, int y,String couleur) {
        this.x = x;
        this.y = y;
        this.couleur = couleur;
    }
    public abstract void affiche();
    public abstract Shape clone();
}
