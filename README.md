# Atividade09

{
    "openapi": "3.0.1",
    "info": {
        "title": "OpenAPI definition",
        "version": "v0"
    },
    "servers": [
        {
            "url": "http://localhost:8080",
            "description": "Generated server url"
        }
    ],
    "paths": {
        "/api/produtos": {
            "get": {
                "tags": [
                    "produto-controller"
                ],
                "operationId": "listar",
                "responses": {
                    "200": {
                        "description": "OK",
                        "content": {
                            "*/*": {
                                "schema": {
                                    "type": "array",
                                    "items": {
                                        "$ref": "#/components/schemas/Produto"
                                    }
                                }
                            }
                        }
                    }
                }
            },
            "post": {
                "tags": [
                    "produto-controller"
                ],
                "operationId": "criar",
                "requestBody": {
                    "content": {
                        "application/json": {
                            "schema": {
                                "$ref": "#/components/schemas/Produto"
                            }
                        }
                    },
                    "required": true
                },
                "responses": {
                    "200": {
                        "description": "OK",
                        "content": {
                            "*/*": {
                                "schema": {
                                    "$ref": "#/components/schemas/Produto"
                                }
                            }
                        }
                    }
                }
            }
        },
        "/api/pedidos": {
            "get": {
                "tags": [
                    "pedido-controller"
                ],
                "operationId": "listar_1",
                "responses": {
                    "200": {
                        "description": "OK",
                        "content": {
                            "*/*": {
                                "schema": {
                                    "type": "array",
                                    "items": {
                                        "$ref": "#/components/schemas/Pedido"
                                    }
                                }
                            }
                        }
                    }
                }
            },
            "post": {
                "tags": [
                    "pedido-controller"
                ],
                "operationId": "criar_1",
                "requestBody": {
                    "content": {
                        "application/json": {
                            "schema": {
                                "$ref": "#/components/schemas/Pedido"
                            }
                        }
                    },
                    "required": true
                },
                "responses": {
                    "200": {
                        "description": "OK",
                        "content": {
                            "*/*": {
                                "schema": {
                                    "$ref": "#/components/schemas/Pedido"
                                }
                            }
                        }
                    }
                }
            }
        },
        "/api/clientes": {
            "get": {
                "tags": [
                    "cliente-controller"
                ],
                "operationId": "listar_2",
                "responses": {
                    "200": {
                        "description": "OK",
                        "content": {
                            "*/*": {
                                "schema": {
                                    "type": "array",
                                    "items": {
                                        "$ref": "#/components/schemas/Cliente"
                                    }
                                }
                            }
                        }
                    }
                }
            },
            "post": {
                "tags": [
                    "cliente-controller"
                ],
                "operationId": "salvar",
                "requestBody": {
                    "content": {
                        "application/json": {
                            "schema": {
                                "$ref": "#/components/schemas/Cliente"
                            }
                        }
                    },
                    "required": true
                },
                "responses": {
                    "200": {
                        "description": "OK",
                        "content": {
                            "*/*": {
                                "schema": {
                                    "$ref": "#/components/schemas/Cliente"
                                }
                            }
                        }
                    }
                }
            }
        },
        "/api/produtos/{id}": {
            "get": {
                "tags": [
                    "produto-controller"
                ],
                "operationId": "buscar",
                "parameters": [
                    {
                        "name": "id",
                        "in": "path",
                        "required": true,
                        "schema": {
                            "type": "integer",
                            "format": "int64"
                        }
                    }
                ],
                "responses": {
                    "200": {
                        "description": "OK",
                        "content": {
                            "*/*": {
                                "schema": {
                                    "$ref": "#/components/schemas/Produto"
                                }
                            }
                        }
                    }
                }
            },
            "delete": {
                "tags": [
                    "produto-controller"
                ],
                "operationId": "deletar",
                "parameters": [
                    {
                        "name": "id",
                        "in": "path",
                        "required": true,
                        "schema": {
                            "type": "integer",
                            "format": "int64"
                        }
                    }
                ],
                "responses": {
                    "200": {
                        "description": "OK"
                    }
                }
            }
        },
        "/api/produtos/nome/{nome}": {
            "get": {
                "tags": [
                    "produto-controller"
                ],
                "operationId": "buscar_1",
                "parameters": [
                    {
                        "name": "nome",
                        "in": "path",
                        "required": true,
                        "schema": {
                            "type": "string"
                        }
                    }
                ],
                "responses": {
                    "200": {
                        "description": "OK",
                        "content": {
                            "*/*": {
                                "schema": {
                                    "$ref": "#/components/schemas/Produto"
                                }
                            }
                        }
                    }
                }
            }
        },
        "/api/pedidos/{id}": {
            "get": {
                "tags": [
                    "pedido-controller"
                ],
                "operationId": "buscar_2",
                "parameters": [
                    {
                        "name": "id",
                        "in": "path",
                        "required": true,
                        "schema": {
                            "type": "integer",
                            "format": "int64"
                        }
                    }
                ],
                "responses": {
                    "200": {
                        "description": "OK",
                        "content": {
                            "*/*": {
                                "schema": {
                                    "$ref": "#/components/schemas/Pedido"
                                }
                            }
                        }
                    }
                }
            },
            "delete": {
                "tags": [
                    "pedido-controller"
                ],
                "operationId": "deletar_1",
                "parameters": [
                    {
                        "name": "id",
                        "in": "path",
                        "required": true,
                        "schema": {
                            "type": "integer",
                            "format": "int64"
                        }
                    }
                ],
                "responses": {
                    "200": {
                        "description": "OK"
                    }
                }
            }
        },
        "/api/pedidos/produtos/{idProduto}": {
            "get": {
                "tags": [
                    "pedido-controller"
                ],
                "operationId": "buscarPorProduto",
                "parameters": [],
                "responses": {
                    "200": {
                        "description": "OK",
                        "content": {
                            "*/*": {
                                "schema": {
                                    "type": "array",
                                    "items": {
                                        "$ref": "#/components/schemas/Pedido"
                                    }
                                }
                            }
                        }
                    }
                }
            }
        },
        "/api/pedidos/clientes/{idCliente}": {
            "get": {
                "tags": [
                    "pedido-controller"
                ],
                "operationId": "buscarPorCliente",
                "parameters": [
                    {
                        "name": "idCliente",
                        "in": "path",
                        "required": true,
                        "schema": {
                            "type": "integer",
                            "format": "int64"
                        }
                    }
                ],
                "responses": {
                    "200": {
                        "description": "OK",
                        "content": {
                            "*/*": {
                                "schema": {
                                    "type": "array",
                                    "items": {
                                        "$ref": "#/components/schemas/Pedido"
                                    }
                                }
                            }
                        }
                    }
                }
            }
        },
        "/api/clientes/{nome}": {
            "get": {
                "tags": [
                    "cliente-controller"
                ],
                "operationId": "buscar_3",
                "parameters": [
                    {
                        "name": "nome",
                        "in": "path",
                        "required": true,
                        "schema": {
                            "type": "string"
                        }
                    }
                ],
                "responses": {
                    "200": {
                        "description": "OK",
                        "content": {
                            "*/*": {
                                "schema": {
                                    "$ref": "#/components/schemas/Cliente"
                                }
                            }
                        }
                    }
                }
            }
        },
        "/api/clientes/{id}": {
            "get": {
                "tags": [
                    "cliente-controller"
                ],
                "operationId": "buscar_4",
                "parameters": [
                    {
                        "name": "id",
                        "in": "path",
                        "required": true,
                        "schema": {
                            "type": "integer",
                            "format": "int64"
                        }
                    }
                ],
                "responses": {
                    "200": {
                        "description": "OK",
                        "content": {
                            "*/*": {
                                "schema": {
                                    "$ref": "#/components/schemas/Cliente"
                                }
                            }
                        }
                    }
                }
            },
            "delete": {
                "tags": [
                    "cliente-controller"
                ],
                "operationId": "deletar_2",
                "parameters": [
                    {
                        "name": "id",
                        "in": "path",
                        "required": true,
                        "schema": {
                            "type": "integer",
                            "format": "int64"
                        }
                    }
                ],
                "responses": {
                    "200": {
                        "description": "OK"
                    }
                }
            }
        }
    },
    "components": {
        "schemas": {
            "Produto": {
                "type": "object",
                "properties": {
                    "id": {
                        "type": "integer",
                        "format": "int64"
                    },
                    "nome": {
                        "type": "string"
                    },
                    "preco": {
                        "type": "number",
                        "format": "double"
                    }
                }
            },
            "Cliente": {
                "type": "object",
                "properties": {
                    "id": {
                        "type": "integer",
                        "format": "int64"
                    },
                    "nome": {
                        "type": "string"
                    },
                    "email": {
                        "type": "string"
                    },
                    "contato": {
                        "type": "string"
                    }
                }
            },
            "Pedido": {
                "type": "object",
                "properties": {
                    "id": {
                        "type": "integer",
                        "format": "int64"
                    },
                    "cliente": {
                        "$ref": "#/components/schemas/Cliente"
                    },
                    "produtos": {
                        "type": "array",
                        "items": {
                            "$ref": "#/components/schemas/Produto"
                        }
                    }
                }
            }
        }
    }
}
