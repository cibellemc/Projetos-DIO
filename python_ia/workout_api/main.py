from fastapi import FastAPI

app = FastAPI(title='WorkoutApi')

@app.get("/")
def read_root():
    return {"message": "Hello, Cibelle!"}

if __name__ == '__main__':
    import uvicorn

    uvicorn.run('main:app', host='localhost', port=8000, log_level='info', reload=True)