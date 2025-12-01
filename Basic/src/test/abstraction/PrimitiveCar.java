package test.abstraction;

public abstract class PrimitiveCar {


       protected abstract void ChangeGear();
        public abstract void accelerate();
        public abstract  void deaccelerate();

        private String Carname;

        public void setCarname(String Carname){
            this.Carname=Carname;
        }
        public  void getCarname(){
            System.out.println();
        }


}
