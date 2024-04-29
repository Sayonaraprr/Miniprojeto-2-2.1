import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Bem-vindo à aventura de Bart Simpson em Springfield!");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Um dia ensolarado em Springfield, e Bart está pronto para aventura!");
        System.out.println("Ele decide sair de casa e explorar a cidade.");
        System.out.println("Enquanto caminha, Bart se depara com várias opções de lugares para visitar.");
        System.out.println("O que Bart deve fazer?");

        int energia = 100; // Energia inicial do Bart
        mostrarEnergia(energia);

        String escolha;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite 'Centro' para explorar o centro da cidade.");
        System.out.println("Digite 'Flanders' para visitar a casa dos Flanders.");

        escolha = scanner.nextLine();

        if (escolha.equalsIgnoreCase("Centro")) {
            energia -= 20; // Explorar o centro consome energia
            mostrarEnergia(energia);

            if (energia <= 0) {
                System.out.println("Bart ficou exausto de tanto explorar e desmaia no meio da rua!");
                return;
            }

            System.out.println("Bart decide explorar o centro de Springfield.");
            System.out.println("Ele encontra a Taverna do Moe, a Loja de Quadrinhos do Android, o Kwik-E-Mart e a Escola Elementar de Springfield.");
            System.out.println("O que Bart deve fazer agora?");

            System.out.println("Digite 'Taverna' para visitar a Taverna do Moe.");
            System.out.println("Digite 'Quadrinhos' para visitar a Loja de Quadrinhos do Android.");
            System.out.println("Digite 'Kwik-E-Mart' para ir ao Kwik-E-Mart.");
            System.out.println("Digite 'Casa' para voltar para casa.");

            escolha = scanner.nextLine();

            if (escolha.equalsIgnoreCase("Taverna")) {
                energia -= 30; // Passar um tempo na Taverna consome mais energia
                mostrarEnergia(energia);

                if (energia <= 0) {
                    System.out.println("Bart ficou tão cansado que acabou adormecendo na Taverna!");
                    return;
                }

                System.out.println("Bart entra na Taverna do Moe e encontra Moe conversando com Homer.");
                System.out.println("Bart decide pedir um refrigerante e aproveitar um tempo lá.");

                System.out.println("Fim da aventura na Taverna do Moe!");
            } else if (escolha.equalsIgnoreCase("Quadrinhos")) {
                energia -= 15; // Visitar a loja de quadrinhos consome menos energia
                mostrarEnergia(energia);

                if (energia <= 0) {
                    System.out.println("Bart ficou tão cansado que acabou desmaiando na Loja de Quadrinhos!");
                    return;
                }

                System.out.println("Bart visita a Loja de Quadrinhos do Android e encontra o dono, o velho Gil.");
                System.out.println("Gil mostra a Bart as últimas edições de Radioactive Man.");

                System.out.println("Fim da aventura na Loja de Quadrinhos do Android!");
            } else if (escolha.equalsIgnoreCase("Kwik-E-Mart")) {
                energia -= 25; // Ir ao Kwik-E-Mart consome energia média
                mostrarEnergia(energia);

                if (energia <= 0) {
                    System.out.println("Bart ficou tão cansado que desmaiou enquanto comprava no Kwik-E-Mart!");
                    return;
                }

                System.out.println("Bart vai ao Kwik-E-Mart e encontra Apu trabalhando.");
                System.out.println("Ele decide pegar algumas guloseimas e brinquedos.");

                System.out.println("Fim da aventura no Kwik-E-Mart!");
            } else if (escolha.equalsIgnoreCase("Casa")) {
                System.out.println("Bart decide que já explorou o suficiente e volta para casa.");

                System.out.println("Fim da aventura!");
            } else {
                System.out.println("Escolha inválida!");
            }
        } else if (escolha.equalsIgnoreCase("Flanders")) {
            energia -= 10; // Visitar os Flanders consome menos energia
            mostrarEnergia(energia);

            if (energia <= 0) {
                System.out.println("Bart ficou tão exausto que caiu no jardim dos Flanders!");
                return;
            }

            System.out.println("Bart visita a casa dos Flanders e encontra Rod e Todd brincando no jardim.");
            System.out.println("Ele pode convencer os irmãos Flanders a se juntarem à sua aventura ou partir sozinho.");

            System.out.println("Digite 'Convencer' para convencer Rod e Todd a se juntarem à aventura.");
            System.out.println("Digite 'Partir' para partir sozinho.");

            escolha = scanner.nextLine();

            if (escolha.equalsIgnoreCase("Convencer")) {
                energia -= 15; // Convencer os Flanders consome energia média
                mostrarEnergia(energia);

                if (energia <= 0) {
                    System.out.println("Bart ficou tão cansado de convencer os Flanders que desmaiou no jardim!");
                    return;
                }

                System.out.println("Bart convence Rod e Todd a se juntarem à aventura.");
                System.out.println("Os três partem juntos pela cidade.");

                System.out.println("Fim da aventura com Rod e Todd!");
            } else if (escolha.equalsIgnoreCase("Partir")) {
                System.out.println("Bart decide partir sozinho e explorar a cidade por conta própria.");

                System.out.println("Fim da aventura solo de Bart!");
            } else {
                System.out.println("Escolha inválida!");
            }
        } else {
            System.out.println("Escolha inválida!");
        }

        scanner.close();
    }

    // Método para exibir a energia do personagem
    public static void mostrarEnergia(int energia) {
        System.out.println("Energia de Bart: " + energia);

        if (energia <= 0) {
            System.out.println("Bart ficou exausto e não tem mais energia para continuar!");
        }
    }
}