import java.util.Scanner;
public class Main
{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        //Подсчет скидки на основе статуса покупателя
        System.out.println("Unesute cijenu proizvoda: ");
        int cijena = sc.nextInt();

        if(cijena <= 0){
            System.out.println("Pogresna cijena");
            return;
        }

        System.out.println("Unesute broj komada: ");
        int brojKomada = sc.nextInt();
        if(brojKomada<=0 || brojKomada > 100){
            System.out.println("Pogresan broj komada");
            return;
        }

        System.out.println("Izaberite status kupca");
        System.out.println("1 – vlasnik šoping kartice (popust 10%)\n2 – student (popust 15%)\n3 – penzioner (popust 20%)\n4 – ništa od navedenog (nema popusta)");
        int status = sc.nextInt();
        int konacnaCijena = cijena * brojKomada;

        double popust = 1;
        double iznos = 1;
        switch(status){
            case 1:
                popust = ((konacnaCijena * 10) / 100);
                iznos = konacnaCijena - popust;
                System.out.println("Ostvarili ste pravo na popust: 10%");
                break;
            case 2:
                popust = ((konacnaCijena * 15) / 100);
                iznos = konacnaCijena - popust;
                System.out.println("Ostvarili ste pravo na popust: 15%");
                break;
            case 3:
                popust = ((konacnaCijena * 20) / 100);
                iznos = konacnaCijena - popust;
                System.out.println("Ostvarili ste pravo na popust: 20%");
                break;
            case 4:
                System.out.println("Nemate popust");
                break;
            default:
                System.out.println("Pogresan status.");
        }
        System.out.println("Iznos računa: "+ konacnaCijena);
        System.out.println("Iznos računa sa popustom: "+ iznos);
    }
}


