import './App.css';
import bootstrap from 'bootstrap/dist/css/bootstrap.css'
import Header from './components/Header';
import HomePage from './components/HomePage';

function App() {
  return (
    <div className="App">
      <div className='bg'>
        <div className='bg-overlay'>
       <HomePage/>
       </div>
      </div>
    </div>
  );
}

export default App;
