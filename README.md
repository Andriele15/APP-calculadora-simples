# Calculadora Simples

> Um aplicativo Android simples para calcular operações básicas.

## 📱 Descrição

A Calculadora simples permite ao usuário calcular a soma, a subtração, a multiplicação e a divisão. Ele exibe um AlertDialog para mostrar o resultado das operações. E impede a divisão por zero,
apresentando um AlertDialog de erro em caso de tentativa de divisão inválida. A Calculadora Simples não suporta operações com mais de dois números simultaneamente,
apenas calcula a operação entre dois valores por vez.

## 🔧 Funcionalidades

- [x] Entrada de dados (primeiro número e segundo número)
- [x] Cálculo de operações básicas
- [x] Exibição do resultado com categorias separadas por cada botão
- [x] Interface simples e intuitiva

## 🚀 Tecnologias Utilizadas

- [x] **Android Studio** (Koala | 2024.1.2)
- [x] **Java** para desenvolvimento
- [x] **ConstraintLayout** para interface responsiva
- [x] **TextView** e **EditText** para entrada e exibição de dados
- [x] **Button** para executar o app.

## 🛠️ Como Rodar o Projeto

Siga os passos abaixo para rodar o projeto localmente:

1. Clone este repositório:

    ```bash
    git clone https://github.com/Andriele15/APP-calculadora-simples.git

    ```

2. Abra o projeto no Android Studio.
3. Compile e execute o projeto em um emulador ou dispositivo físico.

## 📂 Estrutura do Projeto
```bash
├── app
│ ├── src
│ │ ├── main
│ │ │ ├── java/br/ulbra/calculadorasimples
│ │ │ │ ├── MainActivity.java # Atividade principal com o cálculo para as operções básicas 
│ │ │ ├── res
│ │ │ │ ├── layout
│ │ │ │ │ ├── activity_main.xml # Layout da tela principal
│ │ │ │ └── values
│ │ │ │ ├── strings.xml # Strings usadas no app
│ │ │ │ ├── colors.xml # Cores definidas no projeto
│ └── build.gradle # Configuração do Gradle
└── README.md # Este arquivo
```

## 🎨 Design e Prototipagem
 
A interface do app foi criada usando **ConstraintLayout** para manter a responsividade em diferentes tamanhos de tela.
 
O design é minimalista e fácil de usar, com foco na simplicidade. 

1. **Tela Principal**
 
Na tela principal, o usuário insere dois números e dependendo do botão que ele escolher o resultado será dado a partir disso.
 
![calculadora simples](https://github.com/user-attachments/assets/5df7dfe6-f476-4aa9-bebf-414f0d77e642)

 
## 👨‍💻 Desenvolvedores –

**Andriele Pacheco** - Desenvolvedor - [GitHub](https://github.com/Andriele15)

 ## 📄 Licença MIT
 

 Este projeto está licenciado sob os termos da licença MIT. 
Para mais
detalhes, veja o arquivo [LICENSE](LICENSE).

