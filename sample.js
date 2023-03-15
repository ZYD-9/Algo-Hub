export async function getStaticProps() {
    const res = await fetch('https://.../posts')
    const posts = await res.json()
  
    return {
      props: {
        posts,
      }