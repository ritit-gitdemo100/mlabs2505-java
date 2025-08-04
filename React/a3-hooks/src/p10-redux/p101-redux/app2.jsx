import { useDispatch, useSelector } from "react-redux";
import { decrement, increment } from "./redux/action";

export default function P101ReduxApp2() {

    const count = useSelector( state => state.count )
    const dispatch = useDispatch()

    return(
        <div>
            <h2>Redux Counter</h2>
            <h3>{count}</h3>
            <button onClick={() => dispatch(decrement())}>
                Decrement
            </button>
        </div>
    )
}