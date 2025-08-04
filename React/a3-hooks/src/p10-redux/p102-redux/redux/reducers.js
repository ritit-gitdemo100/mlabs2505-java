import { ADD_NOTIFICATION, REMOVE_NOTIFICATION } from "./action"

const initialState = { notifications: [] }

export default function notificationReducer (state = initialState, action) {
    switch (action.type) {
        case ADD_NOTIFICATION:
            return {
                ...state,
                notifications: [...state.notifications, action.payload]
            };
        case REMOVE_NOTIFICATION:
            return {
                ...state,
                notifications : state.notifications.filter(
                    notif => notif.id !== action.payload
                )
            };
        default:
            return state
    }
}