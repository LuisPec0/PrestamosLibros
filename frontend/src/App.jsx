import { useEffect, useState } from "react"
import { listarlibros } from "./services/db"

function App() {

  const [data, setData] = useState([])

  useEffect(() => {
    getData()
  },[])

  const getData = async() =>{
    const datas = await listarlibros()
    console.log(datas)
    return datas
  }

  return (
    <div className="App">

    </div>
  )
}

export default App
