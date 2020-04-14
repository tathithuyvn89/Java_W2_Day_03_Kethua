package Java_W2_Day_03_Kethua.point2d_point3d;

public class Point3D extends Point2D{
    private float z;

   public Point3D(){

   }

    public Point3D(float z) {
        this.z = z;
    }

    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }
    public void setXYZ(float x, float y, float z){
      super.setXY(x,y);
       this.z=z;
    }
    public float[] getXYZ(){
        float[] arr={super.getX(),super.getY(),getZ()};
        return arr;
    }
    public String toString(){
       return " In 3D shape have 1 length is  "
               + getZ()
               + ", an then 2 length are in subclass of "
               + super.toString();
    }
}
