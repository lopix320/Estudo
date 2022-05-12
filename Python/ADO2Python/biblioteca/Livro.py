class Livro:
    def __init__(self, id, titulo, autor, preco):
        self.titulo = titulo
        self.autor = autor
        self.preco = preco
        self.id = id

    def __str__(Self):
        return f"Livro: {Self.titulo}, {Self.autor}, {Self.preco}, {Self.id}"

