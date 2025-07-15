import './App.css'
import Footer from './components/footer/Footer'
import Header from './components/header/Header'
import Sum from './P1-Jsx/p1demo'
import Greeting from './P1-Jsx/p2condition'
import Event1 from './P2-Events/p1event'
import Event2 from './P2-Events/p2event'
import Event3 from './P2-Events/p3event'
import P1State from './P3-State/p1state'
import P2State from './P3-State/p2state'
import P3State from './P3-State/p3state'

function App() {

  return (
    <>
      {/* <Sum/> */}
      {/* <Greeting isLoggedIn={false} /> */}
      {/* <Event3/> */}
      <P3State/>
    </>
  )
}

export default App
