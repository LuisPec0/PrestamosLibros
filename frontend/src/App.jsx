import { Route, Routes } from "react-router-dom"
import { Menudesktop, BookList } from "./components"
import 'bootstrap/dist/css/bootstrap.min.css'
import './app.css'

function App() {
  return (
    <div className="App">
      <Menudesktop />
      <Routes>
        <Route path='/' element={''} />
        <Route path='/bookList' element={<BookList />} />
        <Route path='/addbook' element={''} />
      </Routes>      
    </div>
  )
}

export default App
