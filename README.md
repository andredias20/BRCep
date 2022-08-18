## JSON BR CEP Searcher

This application is made to consume an API that retrives Adress information based on a CEP (CEP stands for Postal Address Code or "**Codigo de Endereço Postal**").
____
### Method
`searchCEP(String cep, cepAPI api)` - return **Locale** _Object_


- `String cep` - Is the CEP you need the information

- `cepAPI api` - Is the API that you want to access, there are two available:
  - `new viacep()`
  - `new apicep()`


If you want to add support to your country address system, open an issue and i will try to implement.