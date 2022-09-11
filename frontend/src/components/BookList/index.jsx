import React, { useEffect, useState } from 'react'
import { listarlibros } from '../../services/db'
import './style.css'

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
    <div className='container__cards'>
     {books !== undefined ?
     (books.map(({titulo, editorial, autor, numeroPaginas, isbn})=>(
      <div key={isbn} className='cards'>
        <h1 className='cards__title'>{titulo}</h1>
        <h3 className='cards__content' >Editorial: {editorial}</h3>
        <h4 className='cards__content' >Paginas: {numeroPaginas}</h4>
        <h4 className='cards__content' >Autor: {autor}</h4>
      </div>
    )))
    :('no hay datos')}
    </div>
  )
}
