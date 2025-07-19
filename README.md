<h1>📱 Android Social Login</h1>
<p align="center"> <img src="https://img.shields.io/badge/Android-3DDC84?style=for-the-badge&logo=android&logoColor=white" alt="Android" /> <img src="https://img.shields.io/badge/Kotlin-7F52FF?style=for-the-badge&logo=kotlin&logoColor=white" alt="Kotlin" /><img src="https://img.shields.io/badge/GitHub-181717?style=for-the-badge&logo=github&logoColor=white" alt="GitHub" /> </p>
<br>Um projeto Android desenvolvido durante o curso de Aceleração Android da Trybe, demonstrando a implementação de uma tela de login de um aplicativo.

<h2>🔍 Visão Geral</h2>
<br>Este projeto tem como objetivo:
<br>✅ A partir de um protótipo desenvolvido com Figma, desenvolver uma tela de login de um aplicativo Android.
<br>✅ Validar que os campos "email" e "senha" tenham algum preenchimento para habilitar o botão "entrar"
<br>✅ Validar que o campo "email" está preenchido com um endereço no formato válido
<br>✅ Validar que o campo "senha" está preenchido com pelo menos 5 caracteres.
<br>✅ Mostrar aviso em caso dados inválidos em cada campo.
<br>✅ Mostrar mensagem de sucesso em caso de preenchimento com dados válidos.
<br>
<h2>🛠️ Tecnologias e Bibliotecas</h2>
<br>Linguagem: Kotlin
<br>
<br>SDK: Android (minSdk 21+)
<br>
<br>Autenticação: email e senha
<br>
<br>Gerenciamento de Dependências: Gradle
<br>
<br>Ferramentas: Android Studio
<br>
<br><h2>⚙️ Configuração</h2>
<br>Pré-requisitos
<br>Android Studio (versão mais recente recomendada)
<br>
<br>Passos para Executar
<br>Clone o repositório:
<br>
<br>shell:
<br>git clone https://github.com/junior8319/trybe-prj-android-social-login.git
<br>Abra o projeto no Android Studio
<br>
<br>Execute o app em um emulador ou dispositivo físico
<br>
<br><h2>📸 Imagens</h2>
<h3>Tela Inicial</h3>
<p align="center"><img width="360px" src="./running-images/starting-page.jpeg" alt="Tela inicial."/></p><br>
<h3>Em preenchimento, botão desabilitado</h3>
<p align="center"><img width="360px" src="./running-images/login-button-disabled.jpeg" alt="Em preenchimento, botão desabilitado"></p>
<p>
    Demonstrando que o botão "Entrar" fica desabilitado até que os campos "Email" e "Senha" tenham algum preenchimento
</p><br>
<h3>Em preenchimento, botão habilitado</h3>
<p align="center"><img width="360px" src="./running-images/filled-login-button-enabled.jpeg" alt="Em preenchimento, botão habilitado"></p>
<p>
    Demonstrando que o botão "Entrar" fica habilitado quando há preenchimento dos campos "Email" e "Senha".
</p><br>
<h3>Validação, aviso de email inválido</h3>
<p align="center"><img width="360px" src="./running-images/invalid-email.jpeg" alt="Aviso de email inválido"></p>
<p>
    Demonstrando que o campo "email" fica com um aviso em vermelho caso esteja em formato inválido.
</p><br>
<h3>Validação, aviso de senha inválida</h3>
<p align="center"><img width="360px" src="./running-images/invalid-password.jpeg" alt="Aviso de senha inválida"></p>
<p>
    Demonstrando que o campo "senha" fica com um aviso em vermelho caso não tenha ao menos 5 caracteres.
</p><br>
<h3>Mensagem de sucesso</h3>
<p align="center"><img width="360px" src="./running-images/login-success.jpeg" alt="Mensagem de sucesso"></p>
<p>
    Quando o preenchimento é feito corretamente, uma mensagem de sucesso é exibida ao clicar no botão "Entrar".
</p>
<p>Observação: Estas imagens foram obtidas a partir da execução do aplicativo em um celular Motorola Moto G84 pareado ao Android Studio via wi-fi</p>
<br>
<br>
<br>📌 Notas Adicionais
<br>
<br>### 🎓 Contexto do Projeto na Trybe  
<br>Este projeto foi desenvolvido como parte da seção "Fundamentos do Desenvolvimendo Android" do curso Aceleração Android da Trybe, com o objetivo de aprender os fundamentos de desenvolvimento de layouts com Android Studio.
