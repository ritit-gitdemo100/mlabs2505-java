import { useParams } from 'react-router-dom';

export default function UserPost() {
  const { userId, postId } = useParams();
  return <h1>User {userId} - Post {postId}</h1>;
}
