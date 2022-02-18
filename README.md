# Servlets & Tomcat
- O Apache Tomcat é um Servidor web escrito em Java diferente do Apache HTTP Server que é escrito em C
- E roda no `http://localhost:8080` por padrão.
- Projetos java fazem parte da URL: `http://localhost:8080/nome-da-classe`
- Uma aplicação web Java pode ter páginas HTML
- Uma servlet é um objeto Java que podemos chamar a partir de uma requisição HTTP
- Foi usado a anotação `@WebServlet`, e ela mapeia a URL para a servlet 
- Aqui a servlet estende a classe HttpServlet e sobrescreve o metodo service
