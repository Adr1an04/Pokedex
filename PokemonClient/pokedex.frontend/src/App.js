import './App.css';
import api from './api/axiosConfig';
import {useState, useEffect} from 'react';
import Layout from './components/Layout';
import {Routes, Route} from 'react-router-dom';

function App() {

  const [pokemon, setPokemon] = useState();

  const getPokemon= async () =>{

    try {

      const response = await api.get("/api/v1/pokemon");

      setPokemon(response.data);

    } catch(err) {
      console.log(err);
    }

  }
  useEffect(() => {

  },[])
   
  return (
    <div className="App">
      
      <Routes>
        <Route path="/" element={Layout}>
          
        </Route>
      </Routes>

    </div>
  );
}

export default App;
