// Classe Pessoa
public class Pessoa {
    // Atributos da Classe Pessoa
        private String nomePessoa;
        private double pesoPessoa;
        private double alturaPessoa;
        private double imcPessoa; 
        private String analiseImcPessoa;
        // Construtor da Classe Pessoa
        public Pessoa(String nomePessoa, double pesoPessoa, double alturaPessoa) {
            this.nomePessoa = nomePessoa;
            this.pesoPessoa = pesoPessoa;
            this.alturaPessoa = alturaPessoa;
            this.imcPessoa = calcularImcPessoa(pesoPessoa, alturaPessoa);
            this.analiseImcPessoa = analisarImcPessoa(imcPessoa);
        }
        // Método para cálculo do IMC da Classe Pessoa
        private static double calcularImcPessoa(double peso, double altura) {
            double imc = 0.0;
            //Fórmula do IMC = Peso ÷ (Altura × Altura)
            imc = peso / ( Math.pow(altura, 2) );
            return imc;
        }
        //Método para analisar o IMC da pessoa
        private String analisarImcPessoa(double imc) {
            if (imc < 18.5) {
                return "baixo peso. É recomendado procurar um médico para avaliação criteriosa do resultado. Pode indicar um estado de consumo do organismo, com poucas reservas e riscos associados.";
            }
            else if (imc > 18.5 && imc <= 24.9) {
                return "peso adequado. Tudo indica que está tudo bem, mas é importante avaliar outros parâmetros da composição corporal, para compreender se estão dentro do recomendado. Algumas pessoas apresentam IMC dentro da normalidade, mas têm circunferência abdominal maior que a recomendada e/ou quantidade de massa gorda acima do ideal";
            }
            else if (imc >= 25 && imc < 30) {
                return "sobrepeso. O sobrepeso está associado ao risco de doenças como diabetes e hipertensão. Então, atenção! Consulte um médico e reveja hábitos para reverter o quadro. Também é importante avaliar outros parâmetros, como a circunferência abdominal.";
            }
            else if (imc >= 30 && imc < 35) {
                return "obesidade grau I. É importante buscar orientação médica e nutricional para entender melhor o seu caso, mesmo que os exames (colesterol e glicemia, por exemplo) estejam normais.";
            }
            else if (imc >= 35 && imc < 40) {
                return "obesidade grau II. Indica um quadro de obesidade mais evoluído em relação à classificação anterior e, mesmo com exames laboratoriais dentro da normalidade, não se deve atrasar a busca por orientação médica e nutricional.";
            }
            else if (imc >= 40) {
                return "obesidade grau III. Nesse ponto, a chance de já estarmos diante de outras doenças associadas é mais elevada. É fundamental buscar orientação médica.";
            }
            else {
                return "Houve um problema inesperado com a análise.";
            }
        }
        // Método para mostrar a Pessoa e resultado do cálculo do IMC
        public void mostrarImcPessoa(){
            System.out.println("************************************************");
            System.out.println("Nome: " + this.nomePessoa);
            System.out.printf(("IMC: %.1f\n").formatted(imcPessoa));
            System.out.println("Peso: " + this.pesoPessoa);
            System.out.println("Altura: " + this.alturaPessoa);
            System.out.println("Análise: " + analiseImcPessoa);
            System.out.println("************************************************");
        }
    }