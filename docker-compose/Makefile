dev:
	@echo "Usando entorno de desarrollo"
	env $(cat .env.dev | xargs) docker compose up

prod:
	@echo "Usando entorno de producción"
	env $(cat .env.prod | xargs) docker compose up -d