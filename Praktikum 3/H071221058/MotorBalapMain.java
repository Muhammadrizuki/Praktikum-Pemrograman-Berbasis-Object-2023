package Tugas3;

public class MotorBalapMain {
    public static void main(String[] args) {
        
    
// Membuat Objek motor1
MotorBalap motor1 = new MotorBalap("Mahen","XeGan", 250);

// Membuat Objek motor2
MotorBalap motor2 = new MotorBalap("Ardi","X Ride", 2);

// Mencari Lawan Untuk motor1
motor1.cariLawan(motor2);

// melakukan balapan motor1 dengan lawannya
motor1.balap(); // Output Dari Behavior Balap()
}
}
