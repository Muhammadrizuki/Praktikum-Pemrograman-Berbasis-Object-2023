public class Cuboid {
        double height;
        double width;
        double length;
      
        //getVolume untuk mengambil nilai atribut volume
        //dan kemudian dikembalikan dengan nilai hasil dari operasi rumus Cuboid (nilai(s*s*s))
        public double getVolume(){
            return getHeight()*getWidth()*getLength();
        }
        // setter untuk menambahkan nilai baru pada atribut
        // getter untuk mengambil nilai yang sudah diperbarui
        public void setHeight(double height){
            this.height = height;
        }
        public double getHeight(){
            return height;
        }
        public void setWidth(double width){
            this.width = width;
        }
        public double getWidth(){
            return width;
        }
        public void setLength(double length){
            this.length = length;
        }
        public double getLength(){
            return length;
        }
}
