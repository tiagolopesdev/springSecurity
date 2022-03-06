<p align="center">
  <img src="https://user-images.githubusercontent.com/58925056/156936674-9e614227-748f-4079-a1b2-e69e78c32c56.png">
</p>

# Spring Security

> O Spring Security oferece proteção, mas também autenticação, autorização e armazenamento de senhas. Além disso, por padrão o Spring Security habilita um usuário e gera uma senha aleatória a cada inicialização, entretanto esse método não é aconselhável o que torna necessário aplicar outras configurações de segurança.

## 🔒Autenticação simples
O Spring possui algumas configurações para definir os usuários na sua camada de segurança, são elas:

- No application.properties;
- Em memória;
- No Configure Adapter;

[Referência de autenticação Simples](https://glysns.gitbook.io/springframework/spring-security/autenticacao-simples)

## 🔒Autenticação usando Banco de Dados

- Após adicionar a dependência do JPA, **cria-se a classe User** (esse classe contem atributos, como id, name, passaword, username e roles);
- Um **repositório para interagir com a entidade User** e fazer operações crud também é implementado;
- Uma **interface**, denominada de *UserDetailsService,* para **recuperar dados relacionados ao usuário** também é implementada em uma classe que retorna o usuário para um contexto de segurança;
- De forma manual os usuário são colocados na aplicação através de uma classe que implementa a interface *CommandLineRunner;*
- Os testes foram realizados dentro a ferramenta Postman

![Untitled 1](https://user-images.githubusercontent.com/58925056/156933587-2c32a883-6203-4a0c-b69a-f80a0ff182a6.png)

[Referência de autenticação com banco de dados](https://glysns.gitbook.io/springframework/spring-security/auth-database)


#  Autor
Feito por Tiago Lopes, entre em contato!

  <a href="https://instagram.com/tiago_lopes_14" target="_blank"><img src="https://img.shields.io/badge/-Instagram-%23E4405F?style=for-the-badge&logo=instagram&logoColor=white" target="_blank"></a> 
  <a href="mailto:saxtiago@gmailcom"><img src="https://img.shields.io/badge/-Gmail-%23333?style=for-the-badge&logo=gmail&logoColor=white" target="_blank"></a>
  <a href="https://www.linkedin.com/in/tiagolopesdeveloper/" target="_blank"><img src="https://img.shields.io/badge/-LinkedIn-%230077B5?style=for-the-badge&logo=linkedin&logoColor=white" target="_blank"></a>
  <a href="https://t.me/tiagoLopesDev" target="_blank"><img src="https://img.shields.io/badge/Telegram-2CA5E0?style=for-the-badge&logo=telegram&logoColor=white" target="_blank"></a>
