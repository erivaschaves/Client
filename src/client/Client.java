
package client;


public class Client {

    
    public static void main(String[] args) {
        Animal animal1 = new Pomba();
        animal1.imprimirCaracteristica();//imprimir no console "A Pomba voa!"
        
        Animal animal2 = new Cachorro();
        animal2.imprimirCaracteristica();//imprimir no console "O Cachorro Late!"
    }
    
}
