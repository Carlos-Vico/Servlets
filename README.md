# Servlets & Tomcat
- Tomcat: Servidor web em Java
- Ele é um servidor `Web` e entende o protocolo HTTP 
- E roda no `http://localhost:8080`
- Projetos java fazem parte da URL: `http://localhost:8080/nome-da-classe`
- Uma aplicação web Java pode ter páginas HTML
- Uma servlet é um objeto Java que podemos chamar a partir de uma requisição HTTP
- Foi usado a anotação `@WebServlet`, e ela mapeia a URL para a servlet 
- Aqui a servlet estende a classe HttpServlet e sobrescreve o metodo service
