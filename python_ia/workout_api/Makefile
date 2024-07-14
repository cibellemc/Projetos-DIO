run:
	@uvicorn workoutapi.main:app --reload

create-migrations:
	set PYTHONPATH=%PYTHONPATH%;%cd% && alembic revision --autogenerate -m $(d)

run-migrations:
	set PYTHONPATH=%PYTHONPATH%;%cd% && alembic upgrade head
