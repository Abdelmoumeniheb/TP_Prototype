public class App {
    public static void main(String[] args) throws Exception {
        Circle c = new Circle(10,20,30,"red");
        c.affiche();
        Circle c2 = c.clone();
        c2.affiche();
        Rectangle r = new Rectangle(10,20,"red",30,40);
        r.affiche();
        Rectangle r2 = r.clone();
        r2.affiche();
    }
}
