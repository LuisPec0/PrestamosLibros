import './style.css'
import Books  from '../../../assets/Books.png'
import AddButton  from '../../../assets/AddButton.png'
import HomeButton  from '../../../assets/Home.png'
import AddUser  from '../../../assets/AddUser.png'
import User  from '../../../assets/User.png'
import { Link } from 'react-router-dom'


export const Menudesktop = () => {
  return (
    <div className='nav'>
      <div className='nav__container__links'>
        <Link to='/booklist' className='nav__container__icons'><img className='nav__icons' src={Books}/></Link>
        <Link to='/addbook' className='nav__container__icons'><img className='nav__icons' src={AddButton}/></Link>     
        <Link to='/' className='nav__container__icons'><img className='nav__icons' src={HomeButton}/></Link>
        <Link to='/users' className='nav__container__icons'><img className='nav__icons' src={User}/></Link>
        <Link to='/addUser' className='nav__container__icons'><img className='nav__icons' src={AddUser}/></Link>
      </div>
    </div>
  )
}
