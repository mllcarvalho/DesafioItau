

GET Mock Client
  http://localhost:9090/clientes/bcdd1048-a501-4608-bc82-66d7b4db3600
  http://localhost:9090/clientes/2ceb26e9-7b5c-417e-bf75-ffaa66e3a76f

  + Response 200 (application/json)

    + Body

            {
                "id": "bcdd1048-a501-4608-bc82-66d7b4db3600",
                "nome": "João Silva",
                "telefone": "912348765",
                "tipoPessoa": "Fisica"
            }
  

GET Mock Contas
  http://localhost:9090/contas/d0d32142-74b7-4aca-9c68-838aeacef96b
  http://localhost:9090/contas/41313d7b-bd75-4c75-9dea-1f4be434007f

  + Response 200 (application/json)

    + Body

            {
                "id": "d0d32142-74b7-4aca-9c68-838aeacef96b,
                "saldo": 5000.00
                "ativo": true
                "limiteDiario": 500.00
            }
      

PUT Mock Contas - Atualiza Saldo
  http://localhost:9090/contas/saldos

  + Request (application/json)

    + Body

            {
              "valor": 1000.00,
              "nomeDestino": "Artur Carneiro",
              "conta": {
                  "idOrigem": "d0d32142-74b7-4aca-9c68-838aeacef96b",
                  "idDestino": "41313d7b-bd75-4c75-9dea-1f4be434007f"
              }
            }

  + Response 204 - No content (application/json)


POST Mock Bacen
  http://localhost:9090/notificacoes

  + Request (application/json)

    + Body

            {
              "valor": 1000.00,
              "conta": {
                  "idOrigem": "d0d32142-74b7-4aca-9c68-838aeacef96b",
                  "idDestino": "41313d7b-bd75-4c75-9dea-1f4be434007f"
              }
            }

  + Response 204 - No Content (application/json)
      

POST API Transferência
http://localhost:8080/transferencia

  + Request (application/json)

    + Body

            {
              "idCliente": "2ceb26e9-7b5c-417e-bf75-ffaa66e3a76f",
              "valor": 1000.00,
              "conta": {
                  "idOrigem": "d0d32142-74b7-4aca-9c68-838aeacef96b",
                  "idDestino": "41313d7b-bd75-4c75-9dea-1f4be434007f"
              }
            }

  + Response 200 (application/json)

    + Body

            {
                "id_transferencia": "410bb5b0-429f-46b1-8621-b7da101b1e28"
            }
