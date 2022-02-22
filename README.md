# Testes end-to-end plataforma WeCares
Testes da plataforma WeCares utilizando Selenium WebDriver e Java

# Como rodar os teste de interface automátizados.

Site: https://wecares.com.br/
Ferramentas utilizadas: Selenium e Eclipse <br />
Linguagem: Java

Modo de execução:
01. Fase - Instalação das ferramentas
- Instalar o Selenium
- Instalar o Eclipe
- Instalar o Java 11

02. Fase - Configuração do ambiente
- Acessar o Selenium, ir em File, depois em  New e por fim, em Other.![image](https://user-images.githubusercontent.com/48301499/125541431-aedabfed-32ac-407f-b875-fafe2d8c565d.png).
- Ir em Maven, escolher a opção Maven Project e clicar em Next.![image](https://user-images.githubusercontent.com/48301499/125541526-a88afa52-93a7-46d7-a8c3-cf376a5fefd8.png).
- Selecionar a opção "Create a simple project(skip archetype selection)" e depois clicar em Next. ![image](https://user-images.githubusercontent.com/48301499/125541720-14a98ea5-9296-4ba0-8e9e-ac6b0f45a191.png)
- Colocar um Group ID e Artifact ID a sua escolha e clicar em Finish. ![image](https://user-images.githubusercontent.com/48301499/125541825-b64d03dd-1d79-46b7-bf4f-6e0ccf44c790.png)
- Com o projeto criado, configurar o arquivo pom.xml igual ao do [link](https://drive.google.com/file/d/1u4Si8ilnzBKPVkwus1iuBWiR9NDOsrh2/view?usp=sharing)
- Clicar com botão direito do mouse no projeto e selecionar a opção Properties![image](https://user-images.githubusercontent.com/48301499/125542501-dce62de8-6477-42e0-9443-807650f01c7c.png)
- Clicar na opção "Add Library". ![image](https://user-images.githubusercontent.com/48301499/125542631-138c9305-687b-4b13-8b65-661605e29b10.png)
- Adicionar a JRE System Library e clicar em Next. ![image](https://user-images.githubusercontent.com/48301499/125542706-0b5550d1-f6fd-420d-88de-3e8852d7c6f2.png)
- Deixar marcado a opção Workspace default JRE e confirme que a versão é a java-11, por fim, clicar em Finish. ![image](https://user-images.githubusercontent.com/48301499/125542834-9bfb310d-81c8-4746-a7c3-3c54d4e61e6e.png)
- Clicar novamente na opção "Add Library". ![image](https://user-images.githubusercontent.com/48301499/125542631-138c9305-687b-4b13-8b65-661605e29b10.png)
- Adicionar a JUnit e clicar em Next.<br />
![image](https://user-images.githubusercontent.com/48301499/125542955-d2a6e1a0-5482-4c21-8e0f-8cebee84f9ca.png)
- Escolher a opção JUnit 4 e clicar em Finish.<br />
![image](https://user-images.githubusercontent.com/48301499/125543037-edc11634-783a-44ca-8ce7-8d80a5e8f5a2.png)

03. Fase - Execução dos testes
- Abra os testes e com o botão direito clique no teste TestesVitta.java. <br />
![image](https://user-images.githubusercontent.com/48301499/125543854-80c25053-89d9-4f53-bf18-40e773325762.png)
- Vá em Run As e escolha a opção 1 JUnit Test. <br />
![image](https://user-images.githubusercontent.com/48301499/125543894-accccb1c-b08e-4ffe-8b05-2ae33d67bf92.png)
- Os testes serão rodados na Aba do JUnit. <br />
![image](https://user-images.githubusercontent.com/48301499/125544432-f14470da-5c80-468b-b1f4-ceff5843cb40.png)


