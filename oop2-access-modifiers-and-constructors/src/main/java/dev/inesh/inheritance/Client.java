package dev.inesh.inheritance;

public class Client {
    public static void main(String[] args) {
        Student st = new Student("Inesh", "Inesh.Scaler@gmail.com", "Inesh");
        st.login("Inesh.Scaler@gmail.com", "Inesh");
        st.attendClass();


        Instructor ins = new Instructor("Inesh", "Inesh.Scaler@gmail.com", "Inesh");
        ins.login("Inesh.Scaler@gmail.com", "Inesh");
        ins.takeClass();

        TA ta = new TA("Inesh", "Inesh.Scaler@gmail.com", "Inesh");
        ta.login("Inesh.Scaler@gmail.com", "Inesh");
        ta.clearHR();



    }
}
