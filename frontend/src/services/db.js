import axios from 'axios'

const URL_LISTAR_LIBROS = 'http://localhost:8080/Listarlibro'

export const listarlibros = async() => {

  try {

    const respose  =  await axios.get(URL_LISTAR_LIBROS)
    
    if(respose.status == 200){
      return respose.data
    }
    
  } catch (error) {
    
    console.log(error)

  }

}
