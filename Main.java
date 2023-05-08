import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ListaDupla listaDupla = new ListaDupla();

        while (true) {

            System.out.println("===========================================");
            System.out.println("1- Verificar posição");
            System.out.println("2- Recuperar celula");
            System.out.println("3- Recuperar um objeto");
            System.out.println("4- Adicionar no começo da lista");
            System.out.println("5- Adicionar no fim da lista");
            System.out.println("6- Adicionar em uma posição especifica ");
            System.out.println("7- Remove do começo");
            System.out.println("8- Remove no final");
            System.out.println("9- Remove em posição especifica");
            System.out.println("10- Verifica se está na lista");
            System.out.println("11- Tamanho da lista");
            System.out.println("12- Esvazia a lista");
            System.out.println("13- Imprimir a lista");
            System.out.println("===========================================");
            int menu = sc.nextInt();

            switch (menu) {

                case 1:
                    System.out.println("========================================");
                    System.out.println("Entre com a posição para saber se ela está ocupada");
                    System.out.println("========================================");
                    int posicaoOcuapda = sc.nextInt();
                    listaDupla.PosicaoOcupada(posicaoOcuapda);
                    System.out.println("A posição está ocupada por: " + posicaoOcuapda);
                    break;

                case 2:
                    System.out.println("========================================");
                    System.out.println("Entre com a posição da celula para recuperar");
                    System.out.println("========================================");
                    int posicaoCelulaRecuperar = sc.nextInt();
                    listaDupla.PegaCelula(posicaoCelulaRecuperar);
                    System.out.println("Célula recuperada com sucesso");
                    break;

                case 3:
                    System.out.println("========================================");
                    System.out.println("Entre com a posição do objeto para recuperar");
                    System.out.println("========================================");
                    int posicaoObjetoRecupear = sc.nextInt();
                    listaDupla.Pega(posicaoObjetoRecupear);
                    System.out.println("Objeto recuperado com sucesso");
                    break;

                case 4:
                    System.out.println("========================================");
                    System.out.println("Entre com a string que deseja adicionar");
                    System.out.println("========================================");
                    String adicionarStringComeco = sc.next();
                    listaDupla.AdicionaNoComeco(adicionarStringComeco);
                    System.out.println("String adicionada com sucesso: " + adicionarStringComeco);
                    break;

                case 5:
                    System.out.println("========================================");
                    System.out.println("Entre com a string que deseja adicionar no final");
                    System.out.println("========================================");
                    String adicionarStringFinal = sc.next();
                    listaDupla.Adiciona(adicionarStringFinal);
                    System.out.println("String adiciona com sucesso ao final da lista: " + adicionarStringFinal);
                    break;

                case 6:
                    System.out.println("========================================");
                    System.out.println("Entre com a string que deseja adicionar");
                    System.out.println("========================================");
                    String adicionarStringPosicao = sc.next();
                    System.out.println("========================================");
                    System.out.println("Entre com a posição que deseja adicionar na fila");
                    System.out.println("========================================");
                    int posicaoFila = sc.nextInt();
                    listaDupla.Adiciona(posicaoFila, adicionarStringPosicao);
                    break;

                case 7:
                    listaDupla.RemovedoComeco();
                    System.out.println("Elemento removido com sucesso");
                    break;

                case 8:
                    listaDupla.RemovedoFim();
                    System.out.println("Elemento removido com sucesso");
                    break;

                case 9:
                    System.out.println("========================================");
                    System.out.println("Entre com a posição especifica que deseja remover");
                    System.out.println("========================================");
                    int posicaoRemover = sc.nextInt();
                    listaDupla.Remove(posicaoRemover);
                    break;

                case 10:
                    System.out.println("========================================");
                    System.out.println("Entre com a string para saber se já está na lista");
                    System.out.println("========================================");
                    String estaNaLista = sc.next();
                    if (listaDupla.Contem(estaNaLista)) {
                        System.out.println("O elemento: " + estaNaLista + " está na lista");
                    } else {
                        System.out.println("Não está na lista");
                    }
                    break;

                case 11:
                    System.out.println("Total de elementos da lista: " + listaDupla.tamanho());
                    break;

                case 12:
                    listaDupla.EsvaziaLista();
                    System.out.println("Lista esvaziada com sucesso!!!");
                    break;

                case 13:
                    listaDupla.Imprimir();
                    break;
            }
        }
    }
}
