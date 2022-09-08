import axios from 'axios'

const BASE_URL = 'http://localhost:8080/Listarlibro'

export const listarlibros = async() => {

  try {

    const respose  =  await axios.get(BASE_URL)
    
    if(respose.status == 200){
      return respose.data
    }
    
  } catch (error) {
    
    console.log(error)

  }

}
