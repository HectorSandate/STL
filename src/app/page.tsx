import Link from 'next/link';

export default function Home() {
  return (
    <div>
      <h1>Bienvenido a la página principal</h1>
      <nav>
        <ul>
          <li>
            <Link href="/lights">Ir a Lights</Link>
          </li>
        </ul>
      </nav>
    </div>
  );
}