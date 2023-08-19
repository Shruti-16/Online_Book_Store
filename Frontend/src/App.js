import './App.css';
import bootstrap from 'bootstrap/dist/css/bootstrap.css'
import HomePage from './components/HomePage';
import LoginForm from './components/LoginForm';
import SignupForm from './components/SingupForm';

function App() {
  return (
    <div className="App">
      <div className='bg'>
        <div className='bg-overlay'>
       <HomePage/>

       <LoginForm/>

       <SignupForm/>
       </div>
      </div>
    </div>
  );
}

export default App;
