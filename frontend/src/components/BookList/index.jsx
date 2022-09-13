import React, { useEffect, useState } from 'react'
import { listarlibros } from '../../services/db'
import 'bootstrap/dist/css/bootstrap.min.css'
import './style.css'
import { Button, Card, Modal, Spinner } from 'react-bootstrap'

export const BookList = () => {

  const [books, setBooks] = useState([])

  useEffect(()=>{
    getBooks()
    console.log(books)
  },[])


  const getBooks = async() => {
    const arrBooks = await listarlibros()
    setBooks(arrBooks)
  }

 

  return (
    <div className="container">
      <div className="col-5 d-flex">
        {books !== undefined ? (
          books.map(({ titulo, editorial, autor, numeroPaginas, isbn }) => (
            <Card
              key={isbn}
              text="dark"
              style={{ width: "20rem", marginRight: "30px" }}
              className="cards mb-2"
            >
              <Card.Header>
                <Card.Title className="text-center">{titulo}</Card.Title>
              </Card.Header>
              <Card.Body>
                <Card.Text>
                  <strong>Paginas:</strong> {numeroPaginas}
                  <br />
                  <strong>Autor:</strong> {autor}
                  <br />
                  <strong>Editorial:</strong> {editorial}
                  <br />
                  <strong>Isbn:</strong> {isbn}
                </Card.Text>
              </Card.Body>
              <Card.Footer className="text-center">
                <Button className="buttons">Info</Button>
              </Card.Footer>
            </Card>
          ))
        ) 
        :(
          <div className='justify-center text center'>
            <Spinner animation="border" variant="secondary" />
          </div>
          )
        }
      </div>
    </div>
  );
}
